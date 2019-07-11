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
    public Result login(@RequestParam Map<String, Object> paramMap) {
        String account = paramMap.get("account").toString();
        String password = paramMap.get("password").toString();
        String phone = paramMap.get("phone").toString();
        if(!(StringUtils.isNotBlank(account) && StringUtils.isNotBlank(password))) {
            return ResultUtil.error(UserCode.PARAM_EXCEPTION.getCode(), UserCode.PARAM_EXCEPTION.getDesc());
        }
        return null;
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
            return ResultUtil.success(user);
        }
        else {
            return ResultUtil.error("账号已被注册");
        }
    }
}
