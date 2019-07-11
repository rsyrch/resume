package www.rsyrch.com.resume.controller;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import www.rsyrch.com.resume.utils.Result;
import www.rsyrch.com.resume.utils.ResultUtil;

@RestController
@RequestMapping(value = "/test")
@CrossOrigin
public class TestController {

    // 模拟数据
    private static List<Car> cars = new ArrayList<Car>();
    static{
        cars.add(new Car(1,"奔驰AMG-g650", new Date().toString()));
        cars.add(new Car(2,"法拉利LaFa", new Date().toString()));
        cars.add(new Car(3,"保时捷918", new Date().toString()));
    }

    @RequestMapping(value = "/hello", method = RequestMethod.POST)
    public List<String> getInfo(@RequestParam Map<String, Object> paramMap) {
        List list = new ArrayList<String>();
        list.add(paramMap.get("data1"));
        list.add(paramMap.get("data2"));
        return list;
    }

    @RequestMapping(value = "/getCarInfo", method = RequestMethod.GET)
    public Result getCarInfo() {
        return ResultUtil.success(cars);
    }

    @RequestMapping(value = "/addCar", method = RequestMethod.POST)
    public Result addCar(@RequestParam Map<String, Object> paramMap) {
        cars.add(new Car(cars.size() + 1, paramMap.get("name").toString(), new Date().toString()));
        return ResultUtil.success();
    }

    @RequestMapping(value = "/deleteCar", method = RequestMethod.GET)
    public Result deleteCar(@Param(value = "carId") String carId) {
        int id = Integer.parseInt(carId);
        for(Car car : cars) {
            if(car.getId() == id) {
                cars.remove(car);
                break;
            }
        }
        int idNumber = 1;
        for(Car car : cars) {
            car.setId(idNumber++);
        }
        return ResultUtil.success();
    }
}
