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
        int status = 0;
        try {
            status = educationService.addEducationtraining(educationtrainingName);
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
     * @Description: 获取所有学历类型
     * @Date: 2019/8/19 15:10
     * @Param: []
     * @Return: www.rsyrch.com.resume.utils.Result
     **/
    @RequestMapping(value = "/getEducationtraining", method = RequestMethod.GET)
    public Result getEducationtraining() {
        try {
            Educationtraining educationtraining = educationService.getEducationtraining();
            return ResultUtil.success(educationtraining);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error(Code.PROGRAM_ERROR.getCode(), Code.PROGRAM_ERROR.getDesc());
        }
    }

    /*
     * @Description: 根据id修改学历类型
     * @Date: 2019/8/19 23:25
     * @Param: [id]
     * @Return: www.rsyrch.com.resume.utils.Result
     **/
    @RequestMapping(value = "/modifyEducationtrainingById", method = RequestMethod.GET)
    public Result modifyEducationtrainingById(@Param("id") String id) {
        if(StringUtils.isBlank(id)) {
            return ResultUtil.error(EducationCode.EDUCATION_TRAINING_ID_IS_NULL.getCode(), EducationCode.EDUCATION_TRAINING_ID_IS_NULL.getDesc());
        }
        int status = 0;
        try {
            status = educationService.modifyEuucationtrainingById(Integer.parseInt(id));
            if(status >0) {
                return ResultUtil.success();
            }
            else {
                return ResultUtil.error(Code.MODIFY_ERROR.getCode(), Code.MODIFY_ERROR.getDesc());
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error(Code.PROGRAM_ERROR.getCode(), Code.PROGRAM_ERROR.getDesc());
        }
    }

    /*
     * @Description: 根据id删除学历类型
     * @Date: 2019/8/20 9:57
     * @Param: [id]
     * @Return: www.rsyrch.com.resume.utils.Result
     **/
    @RequestMapping(value = "/deleteEducationtrainingById", method = RequestMethod.GET)
    public Result deleteEducationtrainingById(@Param("id") String id) {
        if(StringUtils.isBlank(id)) {
            return ResultUtil.error(EducationCode.EDUCATION_TRAINING_ID_IS_NULL.getCode(), EducationCode.EDUCATION_TRAINING_ID_IS_NULL.getDesc());
        }
        int status = 0;
        try {
            status = educationService.deleteEuucationtrainingById(Integer.parseInt(id));
            if(status >0) {
                return ResultUtil.success();
            }
            else {
                return ResultUtil.error(Code.DELETE_ERROR.getCode(), Code.DELETE_ERROR.getDesc());
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error(Code.PROGRAM_ERROR.getCode(), Code.PROGRAM_ERROR.getDesc());
        }
    }
}
