package www.rsyrch.com.resume.controller;/*
 * @ClassName: PositionController
 * @Description:
 * @Date: 2020/2/21 3:02
 **/

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import www.rsyrch.com.resume.utils.Result;
import www.rsyrch.com.resume.utils.ResultUtil;


@RestController
@RequestMapping(value = "/position")
public class PositionController  {

    
    @RequestMapping(value = "/getAllPosition", method = RequestMethod.GET)
    /*
     * @Description: 
     * @Date: 2020/4/15 17:14
     * @Param: []
     * @Return: www.rsyrch.com.resume.utils.Result
     **/
    public Result getAllPosition() {

        return ResultUtil.success();
    }

}
