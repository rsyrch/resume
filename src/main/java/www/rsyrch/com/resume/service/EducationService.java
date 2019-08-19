package www.rsyrch.com.resume.service;/*
 * @ClassName: EducationService
 * @Description:
 * @Date: 2019/8/15 16:16
 **/

import www.rsyrch.com.resume.pojo.Educationtraining;

public interface EducationService {
    int addEducationtraining(String educationtrainingName);
    Educationtraining getEducationtraining();
}
