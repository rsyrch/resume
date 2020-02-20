package www.rsyrch.com.resume.service;

import www.rsyrch.com.resume.pojo.Workexperience;

public interface WorkexperienceService {
    int addWorkexperience(Workexperience workexperience);
    Workexperience getWorkexperienceById(int id);
    int updateWorkexperience(Workexperience workexperience);
    int deleteWorkexperience(int id);
}
