/*
 * @ClassName: WorkexperienceController
 * @Description: 工作经历
 * @Date: 2019/8/23 14:21
 **/

package www.rsyrch.com.resume.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import www.rsyrch.com.resume.service.WorkexperienceService;
import www.rsyrch.com.resume.utils.Result;

import java.util.Map;

@RestController
@RequestMapping(value = "/work")
public class WorkexperienceController {

    @Autowired
    private WorkexperienceService workexperienceService;

    @RequestMapping(value = "/addWork", method = RequestMethod.POST)
    public Result WorkexperienceService(@RequestParam Map<String, Object> map) {
        return null;
    }

}
