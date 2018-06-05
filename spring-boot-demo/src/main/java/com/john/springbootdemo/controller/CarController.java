package com.john.springbootdemo.controller;

import com.john.springbootdemo.entity.Car;
import com.john.springbootdemo.service.CarService;
import com.john.springbootdemo.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("/add")
    public Result add(Car car){
        try {
            carService.add(car);
            Result ok = Result.ok();
            return ok;
        } catch (Exception e) {
            e.printStackTrace();
            Result fail = Result.fail(e.getMessage());
            return fail;
        }
    }

    @GetMapping("/listAll")
    public Result listAll(){
        try {
            List<Car> carList =  carService.listAll();
            Result ok = Result.ok(carList);
            return ok;
        } catch (Exception e) {
            e.printStackTrace();
            Result fail = Result.fail(e.getMessage());
            return fail;
        }
    }
}
