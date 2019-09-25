package www.rsyrch.com.resume.controller;

import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.*;
import www.rsyrch.com.resume.pojo.User;
import www.rsyrch.com.resume.service.UserService;
import www.rsyrch.com.resume.utils.Result;
import www.rsyrch.com.resume.utils.ResultUtil;
import www.rsyrch.com.resume.utils.code.Code;
import www.rsyrch.com.resume.utils.code.UserCode;
import www.rsyrch.com.resume.utils.properties.ResumeProperties;
import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
@RequestMapping(value = "/user")
@CrossOrigin
@EnableConfigurationProperties(ResumeProperties.class)
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ResumeProperties resumeProperties;

    /*
     * @Description 用户注册
     * @Date 2019/4/25 23:51 
     * @Param [account, password]
     * @Return www.rsyrch.com.resume.utils.Message
     **/
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public Result register(@RequestParam Map<String, Object> paramMap) {
        String account = paramMap.get("account").toString();
        String password = paramMap.get("password").toString();
        if(!(StringUtils.isNotBlank(account) && StringUtils.isNotBlank(password))) {
            return ResultUtil.error(UserCode.PARAM_EXCEPTION.getCode(), UserCode.PARAM_EXCEPTION.getDesc());
        }
        int status = 0;
        try {
             status = userService.register(account, password);
        }
        catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error(Code.PROGRAM_ERROR.getCode(), Code.PROGRAM_ERROR.getDesc());
        }
        if(status > 0) {
            return ResultUtil.success();
        }
        else {
            return ResultUtil.error(UserCode.ADD_UER_ERROR.getCode(), UserCode.ADD_UER_ERROR.getDesc());
        }
    }

    /*
     * @Description: 用户登录
     * @Date: 2019/7/8 13:18
     * @Param: [paramMap]
     * @Return: www.rsyrch.com.resume.utils.Result
     **/
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Result login(@RequestParam Map<String, Object> paramMap, HttpSession session) {
        String account = paramMap.get("account").toString();
        String password = paramMap.get("password").toString();
        if(!(StringUtils.isNotBlank(account) && StringUtils.isNotBlank(password))) {
            return ResultUtil.error(UserCode.PARAM_EXCEPTION.getCode(), UserCode.PARAM_EXCEPTION.getDesc());
        }
        try {
            User user = userService.login(account, password);
            if(user != null) {
                // 登陆成功,用户对象放入session,从配置文件获取用户session名
                session.setAttribute(resumeProperties.getUserSessionName(), user);
                return ResultUtil.success(user.getId());
            }
            else {
                return ResultUtil.error(UserCode.USER_PASSWORD_ERROR.getCode(), UserCode.USER_PASSWORD_ERROR.getDesc());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error(Code.PROGRAM_ERROR.getCode(), Code.PROGRAM_ERROR.getDesc());
        }
    }

    /*
     * @Description: 检查账号状态
     * @Date: 2019/7/8 14:31
     * @Param: [accountStatus]
     * @Return: www.rsyrch.com.resume.utils.Result
     **/
    @RequestMapping(value = "/checkAccount", method = RequestMethod.GET)
    public Result checkAccount(@Param(value = "account")String account) {
        if(StringUtils.isBlank(account)) {
            return ResultUtil.error("账号为空");
        }
        try {
            User user = userService.checkAccoutStatus(account);
            if(user == null) {
                return ResultUtil.success();
            }
            else {
                return ResultUtil.error("账号已被注册");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error(Code.PROGRAM_ERROR.getCode(), Code.PROGRAM_ERROR.getDesc());
        }
    }

    /*
     * @Description: 修改密码
     * @Date: 2019/7/25 11:05
     * @Param: [paramMap]
     * @Return: www.rsyrch.com.resume.utils.Result
     **/
    @RequestMapping(value = "/changePassword", method = RequestMethod.POST)
    public Result changePassword(@RequestParam Map<String, Object> paramMap, HttpSession session) {
        String oldPassword = paramMap.get("oldPassword").toString();
        String newPassword = paramMap.get("newPassword").toString();
        if(StringUtils.isBlank(oldPassword)) {
            return ResultUtil.error(UserCode.OLD_PASSWORD_NULL.getCode(), UserCode.OLD_PASSWORD_NULL.getDesc());
        }
        if(StringUtils.isBlank(newPassword)) {
            return ResultUtil.error(UserCode.NEW_PASSWORD_NULL.getCode(), UserCode.NEW_PASSWORD_NULL.getDesc());
        }
        // 获取用户session
        Object object = session.getAttribute(resumeProperties.getUserSessionName());
        if(object == null) {
            // 用户未登录或登录超时
            return ResultUtil.error(UserCode.USER_NOTLOGIN_OR_TIMEOUT.getCode(), UserCode.USER_NOTLOGIN_OR_TIMEOUT.getDesc());
        }
        User user = (User)object;
        try {
            int status = userService.changePassword(user.getId(), oldPassword, newPassword);
            if(status > 0) {
                // 密码修改成功
                return ResultUtil.success();
            }
            else {
                return ResultUtil.error(UserCode.CHANGE_PASSWORD_ERROR.getCode(), UserCode.CHANGE_PASSWORD_ERROR.getDesc());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error(Code.PROGRAM_ERROR.getCode(), Code.PROGRAM_ERROR.getDesc());
        }

    }

    /*
     * @Description: 根据id获取用户信息
     * @Date: 2019/8/23 14:46
     * @Param: [userId]
     * @Return: www.rsyrch.com.resume.utils.Result
     **/
    @RequestMapping(value = "/userInfromation")
    public Result getUserInformationById(@Param(value = "userId") String userId) {
        if(StringUtils.isBlank(userId)) {
            return ResultUtil.error(UserCode.USER_ID_IS_NULL.getCode(), UserCode.USER_ID_IS_NULL.getDesc());
        }
        User user = null;
        try {
            user = userService.getUserInformationById(userId);
        }
        catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error(Code.PROGRAM_ERROR.getCode(), Code.PROGRAM_ERROR.getDesc());
        }
        if(user == null) {
            return ResultUtil.error(UserCode.USER_NOT_EXIST.getCode(), UserCode.USER_NOT_EXIST.getDesc());
        }
        else {
            user.setPassword("");
        }
        return ResultUtil.success(user);
    }
}
