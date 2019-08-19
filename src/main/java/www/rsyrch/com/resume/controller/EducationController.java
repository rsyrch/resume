/*
 * @ClassName: EducationController
 * @Description: 教育经历
 * @Date: 2019/8/15 10:36
 **/
package www.rsyrch.com.resume.controller;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import www.rsyrch.com.resume.pojo.Educationtraining;
import www.rsyrch.com.resume.service.EducationService;
import www.rsyrch.com.resume.utils.Result;
import www.rsyrch.com.resume.utils.ResultUtil;
import www.rsyrch.com.resume.utils.code.Code;
import www.rsyrch.com.resume.utils.code.EducationCode;

@RestController
@RequestMapping(value = "/education")
public class EducationController {

    @Autowired
    private EducationService educationService;
    /*
     * @Description: 增加学历类型
     * @Date: 2019/8/15 15:37
     * @Param: [educationtrainingName]
     * @Return: www.rsyrch.com.resume.utils.Result
     **/
    @RequestMapping(value = "/addEducationtraining", method = RequestMethod.GET)
    public Result addEducationtraining(@Param(value = "educationtrainingName") String educationtrainingName) {
        if(StringUtils.isBlank(educationtrainingName)) {
            return ResultUtil.error(EducationCode.EDUCATION_TRAINING_IS_NULL.getCode(), EducationCode.EDUCATION_TRAINING_IS_NULL.getDesc());
        }
        int status = educationService.addEducationtraining(educationtrainingName);
        if(status > 0) {
            return ResultUtil.success();
        }
        else {
            return ResultUtil.error(Code.ADD_ERROR.getCode(), Code.ADD_ERROR.getDesc());
        }
    }

    /*
     * @Description: 获取所有学历类型
     * @Date: 2019/8/19 15:10
     * @Param: []
     * @Return: www.rsyrch.com.resume.utils.Result
     **/
    public Result getEducationtraining() {
        Educationtraining educationtraining = educationService.getEducationtraining();
        return ResultUtil.success(educationtraining);
    }
}
