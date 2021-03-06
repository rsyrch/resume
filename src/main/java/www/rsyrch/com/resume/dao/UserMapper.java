package www.rsyrch.com.resume.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import www.rsyrch.com.resume.pojo.User;
import www.rsyrch.com.resume.pojo.UserExample;

@Mapper
public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    // 根据用户账号查询用户
    User selectUserByAccount(String account);

    // 修改用户密码
    int changePassword(@Param("id") int id, @Param("oldPassword") String oldPassword, @Param("newPassword") String newPassword);

    // 登录
    User userLogin(@Param("account") String account, @Param("password") String password);
}