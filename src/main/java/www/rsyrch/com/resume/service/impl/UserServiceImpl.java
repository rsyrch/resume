package www.rsyrch.com.resume.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import www.rsyrch.com.resume.dao.UserMapper;
import www.rsyrch.com.resume.pojo.User;
import www.rsyrch.com.resume.service.UserService;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /*
     * @Description: 注册
     * @Date: 2019/7/8 11:27
     * @Param: [account, password]
     * @Return: int
     **/
    @Override
    public int register(String account, String password) {
        User user = new User();
        user.setAccoumtnumber(account);
        user.setPassword(password);
        user.setCreatetime(new Date());
        int status = 0;
        try{
            // 检查用户是否注册
            User getUser = userMapper.selectUserByAccount(account);
            if(getUser == null) {
                status = userMapper.insert(user);
            }
            else {
                status = -1;
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return status;
    }

    /*
     * @Description: 检查账号 1:已注册 0:未注册
     * @Date: 2019/7/8 15:29
     * @Param: [account]
     * @Return: int
     **/
    @Override
    public User checkAccoutStatus(String account) {
        User user = userMapper.selectUserByAccount(account);
        return user;
    }

    /*
     * @Description: 修改密码
     * @Date: 2019/7/25 11:10
     * @Param: [oldPassword, newPassword]
     * @Return: www.rsyrch.com.resume.pojo.User
     **/
    @Override
    public int changePassword(int id, String oldPassword, String newPassword) {
        return userMapper.changePassword(id, oldPassword, newPassword);
    }

    /*
     * @Description: 登录
     * @Date: 2019/8/6 15:15
     * @Param: [account, password]
     * @Return: www.rsyrch.com.resume.pojo.User
     **/
    public User login(String account, String password) {
        User user = userMapper.userLogin(account, password);
        return user;
    }

    /*
     * @Description: 根据id获取用户信息
     * @Date: 2019/8/23 14:54
     * @Param: [id]
     * @Return: www.rsyrch.com.resume.pojo.User
     **/
    @Override
    public User getUserInformationById(String id) {
        User user = userMapper.selectByPrimaryKey(Integer.parseInt(id));
        return user;
    }
}
