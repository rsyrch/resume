package www.rsyrch.com.resume.controller;

import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import www.rsyrch.com.resume.pojo.User;
import www.rsyrch.com.resume.service.UserService;
import www.rsyrch.com.resume.utils.Result;
import www.rsyrch.com.resume.utils.ResultUtil;
import www.rsyrch.com.resume.utils.code.UserCode;
import javax.servlet.http.HttpSession;
import java.util.Map;

@RestController
@RequestMapping(value = "/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

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
        int status = userService.register(account, password);
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
        User user = userService.login(account, password);
        if(user != null) {
            // 登陆成功,用户对象放入session
            session.setAttribute(UserCode.USER_SESSION.getDesc(), user);
            return ResultUtil.success(user.getId());
        }
        else {
            return ResultUtil.error(UserCode.USER_PASSWORD_ERROR.getCode(), UserCode.USER_PASSWORD_ERROR.getDesc());
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
        User user = userService.checkAccoutStatus(account);
        if(user == null) {
            return ResultUtil.success();
        }
        else {
            return ResultUtil.error("账号已被注册");
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
        Object object = session.getAttribute(UserCode.USER_SESSION.getDesc());
        if(object == null) {
            // 用户未登录或登录超时
            return ResultUtil.error(UserCode.USER_NOTLOGIN_OR_TIMEOUT.getCode(), UserCode.USER_NOTLOGIN_OR_TIMEOUT.getDesc());
        }
        User user = (User)object;
        int status = userService.changePassword(user.getId(), oldPassword, newPassword);
        if(status > 0) {
            // 密码修改成功
            return ResultUtil.success();
        }
        else {
            return ResultUtil.error(UserCode.CHANGE_PASSWORD_ERROR.getCode(), UserCode.CHANGE_PASSWORD_ERROR.getDesc());
        }
    }
}
