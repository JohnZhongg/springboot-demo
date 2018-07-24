package com.john.springbootdemo.controller;

import com.john.springbootdemo.entity.Car;
import com.john.springbootdemo.service.CarService;
import com.john.springbootdemo.vo.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author JohnZhong
 *
 * CarController
 */
@Api(value = "车辆控制器", description = "车辆信息等数据操作")
@RestController
@RequestMapping("/car")
public class CarController {
    @Autowired
    private CarService carService;


    /**
     * 根据浏览器传入的Car是否包含id而判断进行新增还是更新操作
     * @param car
     * @return
     */
    @ApiOperation(value = "增加或者修改", notes = "增加或者修改一个车辆实体信息", httpMethod = "POST")
    @PostMapping("/addOrUpdate")
    public Result addOrUpdate(@RequestBody Car car){
        if(car.getId() == null){
            carService.add(car);
        }else{
            carService.updateOne(car);
        }
        return Result.ok();
    }


    /**
     * 查找所有的Car
     * @return
     */
    @ApiOperation(value = "查找所有的Car", notes = "查找所有车辆", httpMethod = "GET")
    @GetMapping("/listAll")
    public Result listAll(){
        List<Car> carList =  carService.listAll();
        return Result.ok(carList);
    }

    /**
     * 根据id删除一个Car
     * @param id
     * @return
     */
    @ApiOperation(value = "删除一个car", notes = "删除一个车辆", httpMethod = "POST")
    @ApiImplicitParam(name  = "id", value = "car的主键", dataType = "INTEGER")
    @PostMapping("/deleteOne")
    public Result deleteOne(@RequestParam(value = "id")Integer id){
        carService.deleteOne(id);
        return Result.ok();
    }


    /**
     * 根据id查找一个Car
     * @param id
     * @return
     */
    @ApiOperation(value = "根据id查找一个car", notes = "根据id查找一个车辆", httpMethod = "POST")
    @ApiImplicitParam(name  = "id", value = "car的主键", dataType = "INTEGER")
    @PostMapping("/queryOne")
    public Result queryOne(@RequestParam(value = "id")Integer id){
        Car car = carService.queryOne(id);
        return Result.ok(car);
    }
}
