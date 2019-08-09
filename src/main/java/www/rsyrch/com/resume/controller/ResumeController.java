package www.rsyrch.com.resume.controller;/*
 * @ClassName: ResumeController
 * @Description: 简历相关
 * @Date: 2019/8/9 12:01
 **/

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import www.rsyrch.com.resume.utils.Result;

@RestController
@RequestMapping(value = "/resume")
public class ResumeController {

    /*
     * @Description: 获取简历信息
     * @Date: 2019/8/9 12:04
     * @Param: []
     * @Return: www.rsyrch.com.resume.utils.Result
     **/
    @RequestMapping(value = "/getResume", method = RequestMethod.POST)
    public Result getResume() {
        return null;
    }
}
