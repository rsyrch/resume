package www.rsyrch.com.resume.controller;
/*
 * @ClassName: PositionController
 * @Description: 职业类
 * @Date: 2020/2/21 3:02
 **/

import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
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

    /*
     * @Description:
     * @Date: 2020/4/15 17:14
     * @Param: []
     * @Return: www.rsyrch.com.resume.utils.Result
     **/
    @RequestMapping(value = "/getAllPosition", method = RequestMethod.GET)
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
    public Result addPosition(@Param(value = "fatherId") String fatherId, @Param(value = "positionName") String positionName, @Param(value = "distance") String distance) {
        int superiorPosition = 0;   // 上级ID
        if(StringUtils.isNotBlank(fatherId)) {
            superiorPosition = Integer.parseInt(fatherId);
        }
        if(StringUtils.isBlank(positionName)) {
            return ResultUtil.error(PositionCode.NAME_IS_NULL.getCode(), PositionCode.NAME_IS_NULL.getDesc());
        }
        if(StringUtils.isBlank(distance)) {
            return ResultUtil.error(PositionCode.DISTANCE_IS_NULL.getCode(), PositionCode.DISTANCE_IS_NULL.getDesc());
        }
        try {
            int status = positionService.addPosition(superiorPosition, positionName, Integer.parseInt(distance));
            if(status > 0) {
                return ResultUtil.success();
            }
            else {
                return ResultUtil.error(PositionCode.ADD_FAILURE.getCode(), PositionCode.ADD_FAILURE.getDesc());
            }
        }catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error(Code.PROGRAM_ERROR.getCode(), Code.PROGRAM_ERROR.getDesc());
        }
    }

    /*
     * @Description: 更新职业
     * @Date: 2020/5/4 21:49
     * @Param: [map]
     * @Return: www.rsyrch.com.resume.utils.Result
     **/
    @RequestMapping(value = "/updatePosition", method = RequestMethod.POST)
    public Result updatePosition(@RequestBody Map<String, String> map) {
        int positionId;
        if(StringUtils.isNotBlank(map.get("positionId"))) {
            positionId = Integer.parseInt(map.get("positionId"));
        }
        return ResultUtil.success();
    }

    /*
     * @Description: 删除职业
     * @Date: 2021/8/2 23:59
     * @Param:  [map]
     * @Return: www.rsyrch.com.resume.utils.Result
     **/
    @RequestMapping(value = "/deletePosition", method = RequestMethod.POST)
    public Result deletePosition(@RequestBody Map<String, String> map) {
        return ResultUtil.success();
    }

}
