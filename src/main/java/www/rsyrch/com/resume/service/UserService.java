package www.rsyrch.com.resume.service;


import www.rsyrch.com.resume.pojo.User;

public interface UserService {
    int register(String account, String password);
    User checkAccoutStatus(String account);
    int changePassword(int id, String oldPassword, String newPassword);
}
