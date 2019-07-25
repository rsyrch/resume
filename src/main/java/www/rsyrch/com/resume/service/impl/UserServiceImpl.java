package www.rsyrch.com.resume.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import www.rsyrch.com.resume.dao.UserMapper;
import www.rsyrch.com.resume.pojo.User;
import www.rsyrch.com.resume.service.UserService;
import org.springframework.stereotype.Service;

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
        int status = 0;
        try{
            status = userMapper.insert(user);
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
     * @Description:
     * @Date: 2019/7/25 11:10
     * @Param: [oldPassword, newPassword]
     * @Return: www.rsyrch.com.resume.pojo.User
     **/
    @Override
    public int changePassword(int id, String oldPassword, String newPassword) {
        return userMapper.changePassword(id, oldPassword, newPassword);
    }
}
