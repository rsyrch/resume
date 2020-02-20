/*
 * @ClassName: WorkexperienceServiceImpl
 * @Description:
 * @Date: 2019/9/10 15:08
 **/
package www.rsyrch.com.resume.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import www.rsyrch.com.resume.dao.WorkexperienceMapper;
import www.rsyrch.com.resume.pojo.Workexperience;
import www.rsyrch.com.resume.service.WorkexperienceService;

public class WorkexperienceServiceImpl implements WorkexperienceService {

    @Autowired
    private WorkexperienceMapper workexperienceMapper;

    /*
     * @Description: 增加工作经历
     * @Date: 2019/9/10 15:09
     * @Param: [workexperience]
     * @Return: int
     **/
    @Override
    public int addWorkexperience(Workexperience workexperience) {
        int status = workexperienceMapper.insert(workexperience);
        return status;
    }

    /*
     * @Description: 根据id得到工作经历
     * @Date: 2019/9/18 1:07
     * @Param: [id]
     * @Return: www.rsyrch.com.resume.pojo.Workexperience
     **/
    @Override
    public Workexperience getWorkexperienceById(int id) {
        return workexperienceMapper.selectByPrimaryKey(id);
    }

    /*
     * @Description: 更新工作经历
     * @Date: 2019/9/26 22:05
     * @Param: [workexperience]
     * @Return: int
     **/
    @Override
    public int updateWorkexperience(Workexperience workexperience) {
        return workexperienceMapper.updateByPrimaryKey(workexperience);
    }

    /*
     * @Description:
     * @Date: 2020/2/8 23:37
     * @Param: [id]
     * @Return: int
     **/
    @Override
    public int deleteWorkexperience(int id) {
        return workexperienceMapper.updateWorkexperienceDeleteStatusById(id);
    }
}
