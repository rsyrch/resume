package www.rsyrch.com.resume.service.impl;/*
 * @ClassName: EducationServiceImpl
 * @Description:
 * @Date: 2019/8/15 16:18
 **/

import www.rsyrch.com.resume.pojo.Educationtraining;
import www.rsyrch.com.resume.service.EducationService;

public class EducationServiceImpl implements EducationService {
    /*
     * @Description: 增加学历类型
     * @Date: 2019/8/15 16:19
     * @Param: [educationtrainingName]
     * @Return: int
     **/
    @Override
    public int addEducationtraining(String educationtrainingName) {
        Educationtraining educationtraining = new Educationtraining();
        educationtraining.setEducationtrainingname(educationtrainingName);

        return 0;
    }
}
