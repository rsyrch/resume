/*
 * @ClassName: WorkexperienceController
 * @Description: 工作经历
 * @Date: 2019/8/23 14:21
 **/

package www.rsyrch.com.resume.controller;

import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import www.rsyrch.com.resume.pojo.Workexperience;
import www.rsyrch.com.resume.service.WorkexperienceService;
import www.rsyrch.com.resume.utils.Result;
import www.rsyrch.com.resume.utils.ResultUtil;
import www.rsyrch.com.resume.utils.code.Code;
import www.rsyrch.com.resume.utils.code.WorkCode;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;


@RestController
@RequestMapping(value = "/work")
public class WorkexperienceController {

    @Autowired
    private WorkexperienceService workexperienceService;

    /*
     * @Description: 新增工作经历
     * @Date: 2019/9/13 1:27
     * @Param: [map]
     * @Return: www.rsyrch.com.resume.utils.Result
     **/
    @RequestMapping(value = "/addWork", method = RequestMethod.POST)
    public Result addWork(@RequestParam Map<String, Object> map) {
        try {
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Workexperience workexperience = new Workexperience();
            workexperience.setName(map.get("companyName").toString().trim());
            workexperience.setDepartment(map.get("department").toString().trim());
            workexperience.setPosition(map.get("position").toString().trim());
            workexperience.setSalary(new BigDecimal(map.get("salary").toString().trim()));
            workexperience.setWorkcontent(map.get("workContent").toString());
            workexperience.setStarttime(dateFormat.parse(map.get("startTime").toString().trim()));
            workexperience.setEndtime(dateFormat.parse(map.get("endTime").toString().trim()));
            workexperience.setCreatetime(new Date());
            int status = workexperienceService.addWorkexperience(workexperience);
            if(status > 0) {
                return ResultUtil.success();
            }
            else {
                return ResultUtil.error(Code.ADD_ERROR.getCode(), Code.ADD_ERROR.getDesc());
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error(Code.PROGRAM_ERROR.getCode(), Code.PROGRAM_ERROR.getDesc());
        }
    }

    /*
     * @Description: 修改工作经历
     * @Date: 2019/9/25 0:40
     * @Param: [map]
     * @Return: www.rsyrch.com.resume.utils.Result
     **/
    @RequestMapping(value = "/modifyWork", method = RequestMethod.POST)
    public Result modifyWork(@RequestParam Map<String, Object> map) {
        String id = map.get("id").toString().trim();
        String companyName = map.get("companyName").toString().trim();  // 公司
        String department = map.get("department").toString().trim();    // 部门
        String position = map.get("position").toString().trim();    // 职位
        String salary = map.get("salary").toString().trim();    // 薪资
        String workContent = map.get("workContent").toString().trim();  // 工作内容
        String startTime = map.get("startTime").toString().trim();  // 工作开始时间
        String endTime = map.get("endTime").toString().trim();  // 工作结束时间

        try {

            if(StringUtils.isBlank(id)) {
                return ResultUtil.error(WorkCode.WORK_ID_IS_NULL.getCode(), WorkCode.WORK_ID_IS_NULL.getDesc());
            }
            Workexperience workexperience = workexperienceService.getWorkexperienceById(Integer.parseInt(id));
            if(workexperience == null) {
                return ResultUtil.error(WorkCode.WORK_IS_NULL.getCode(), WorkCode.WORK_IS_NULL.getDesc());
            }

            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            if(StringUtils.isNotBlank(companyName)) {
                workexperience.setName(companyName);
            }
            if(StringUtils.isNotBlank(department)) {
                workexperience.setDepartment(department);
            }
            if(StringUtils.isNotBlank(position)) {
                workexperience.setPosition(position);
            }
            if(StringUtils.isNotBlank(salary)) {
                workexperience.setSalary(new BigDecimal(salary));
            }
            if(StringUtils.isNotBlank(workContent)) {
                workexperience.setWorkcontent(workContent);
            }
            if(StringUtils.isNotBlank(startTime)) {
                workexperience.setStarttime(dateFormat.parse(startTime));
            }
            if(StringUtils.isNotBlank(endTime)) {
                workexperience.setEndtime(dateFormat.parse(endTime));
            }
            workexperience.setUpdatetime(new Date());
            int status = workexperienceService.updateWorkexperience(workexperience);
            if(status <= 0) {
                return ResultUtil.error(WorkCode.UPDATE_ERROR.getCode(), WorkCode.UPDATE_ERROR.getDesc());
            }
            return ResultUtil.success();
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error(Code.PROGRAM_ERROR.getCode(), Code.PROGRAM_ERROR.getDesc());
        }
    }

    /*
     * @Description: 删除工作经历
     * @Date: 2019/11/6 0:16
     * @Param: [id]
     * @Return: www.rsyrch.com.resume.utils.Result
     **/
    public Result deleteWork(@Param(value = "id") String id) {
        if(StringUtils.isNotBlank(id)) {
            return ResultUtil.error(WorkCode.WORK_ID_IS_NULL.getCode(), WorkCode.WORK_ID_IS_NULL.getDesc());
        }
        try {
            int status = workexperienceService.deleteWorkexperience(Integer.parseInt(id));
            if(status > 0) {
                return ResultUtil.success();
            }
            return ResultUtil.error(WorkCode.DELETE_WORK_ERROR.getCode(), WorkCode.DELETE_WORK_ERROR.getDesc());
        }
        catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error(Code.DELETE_ERROR.getCode(), Code.DELETE_ERROR.getDesc());
        }
    }


}
