/*
 * @ClassName: WorkexperienceController
 * @Description: 工作经历
 * @Date: 2019/8/23 14:21
 **/

package www.rsyrch.com.resume.controller;

import org.apache.commons.lang.StringUtils;
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
import www.rsyrch.com.resume.utils.code.Work;

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
    public Result addWork(@RequestParam Map<String, Object> map) throws Exception {
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
    }

    @RequestMapping(value = "/modifyWork", method = RequestMethod.POST)
    public Result modifyWork(@RequestParam Map<String, Object> map) {
        String id = map.get("id").toString().trim();
        if(StringUtils.isBlank(id)) {
            return ResultUtil.error(Work.WORK_ID_IS_NULL.getCode(), Work.WORK_ID_IS_NULL.getDesc());
        }

        return null;
    }

}
