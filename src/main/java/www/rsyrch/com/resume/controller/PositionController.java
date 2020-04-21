package www.rsyrch.com.resume.controller;/*
 * @ClassName: PositionController
 * @Description:
 * @Date: 2020/2/21 3:02
 **/

import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import www.rsyrch.com.resume.service.PositionService;
import www.rsyrch.com.resume.utils.Result;
import www.rsyrch.com.resume.utils.ResultUtil;
import www.rsyrch.com.resume.utils.code.Code;
import www.rsyrch.com.resume.utils.code.PositionCode;

import java.util.Map;


@RestController
@RequestMapping(value = "/position")
public class PositionController  {

    @Autowired
    private PositionService positionService;

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


    /*
     * @Description: 增加职业
     * @Date: 2020/4/17 11:22
     * @Param: []
     * @Return: www.rsyrch.com.resume.utils.Result
     **/
    @RequestMapping(value = "/addPosition", method = RequestMethod.GET)
    public Result addPosition(@Param(value = "fatherId") String fatherId, @Param(value = "positionName") String positionName) {
        int superiorPosition = 0;   // 上级ID
        if(StringUtils.isNotBlank(fatherId)) {
            superiorPosition = Integer.parseInt(fatherId);
        }
        if(StringUtils.isBlank(positionName)) {
            return ResultUtil.error(PositionCode.NAME_ISNULL.getCode(), PositionCode.NAME_ISNULL.getDesc());
        }
        try {
            int status = positionService.addPosition(superiorPosition, positionName);
            if(status > 0) {
                return ResultUtil.success();
            }
            else {
                return ResultUtil.error(PositionCode.ADD_FAILURE.getCode(), PositionCode.NAME_ISNULL.getDesc());
            }
        }catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error(Code.PROGRAM_ERROR.getCode(), Code.PROGRAM_ERROR.getDesc());
        }
    }

    public Result updatePosition(@RequestParam Map<String, String> map) {
        String positionId = map.get("positionId");
        return null;
    }

}
