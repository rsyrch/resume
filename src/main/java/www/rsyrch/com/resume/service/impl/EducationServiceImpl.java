/*
 * @ClassName: EducationServiceImpl
 * @Description:
 * @Date: 2019/8/15 16:18
 **/

package www.rsyrch.com.resume.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import www.rsyrch.com.resume.dao.EducationtrainingMapper;
import www.rsyrch.com.resume.pojo.Educationtraining;
import www.rsyrch.com.resume.service.EducationService;
import java.util.Date;

public class EducationServiceImpl implements EducationService {

    @Autowired
    EducationtrainingMapper educationtrainingMapper;

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
        educationtraining.setCreatetime(new Date());
        return 0;
    }

    /*
     * @Description: 获取学历类型
     * @Date: 2019/8/19 14:43
     * @Param: []
     * @Return: www.rsyrch.com.resume.pojo.Educationtraining
     **/
    @Override
    public Educationtraining getEducationtraining() {
        return educationtrainingMapper.getAllEducationtraining();
    }
}
