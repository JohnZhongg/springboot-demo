package com.john.springbootdemo.controller;

import com.john.springbootdemo.entity.Car;
import com.john.springbootdemo.service.CarService;
import com.john.springbootdemo.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author JohnZhong
 *
 * CarController
 */
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
    @PostMapping("/addOrUpdate")
    public Result addOrUpdate(Car car){
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
    @PostMapping("/queryOne")
    public Result queryOne(@RequestParam(value = "id")Integer id){
        Car car = carService.queryOne(id);
        return Result.ok(car);
    }
}
