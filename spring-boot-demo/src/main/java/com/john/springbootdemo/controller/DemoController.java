package com.john.springbootdemo.controller;

import com.john.springbootdemo.entity.*;
import com.john.springbootdemo.exception.MyException;
import com.john.springbootdemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author JohnZhong
 *
 * 测试controller
 */
@RestController
@RequestMapping("/demo")
public class DemoController {
    @Autowired
    DemoService demoService;

    /**
     * 欢迎i信息
     * @return
     */
    @GetMapping("/greeting")
    public String greeting(){
        return demoService.getGreetingInfo();
    }


    /**
     *  根据不同的对象返回其所吃的食物
     * @return
     */
    @PostMapping("/eating")
    public String eating(String animal){
        return demoService.eating(animal);
    }


    @GetMapping("/error")
    public String error() throws MyException{
        throw new MyException();
    }

    @PostMapping("/receiveArrayInObject")
    public String receiveArrayInObject(@RequestBody DemoAObj demoObj){
        List<DemoBObj> demoBObjList = demoObj.getDemoBObjList();
        for (DemoBObj demoBObj : demoBObjList) {
            Integer[] idArr = demoBObj.getIdArr();
            for (int i = 0; i < idArr.length; i++) {
                Integer integer = idArr[i];
                System.out.println(integer);
            }
        }
        return "ok";
    }

    @PostMapping("/receiveListInObject")
    public String receiveListInObject(@RequestBody DemoCObj demoObj){
        List<DemoDObj> demoDObjList = demoObj.getDemoDObjList();
        for (DemoDObj demoDObj : demoDObjList) {
            List<String> list = demoDObj.getList();
            for (String s : list) {
                System.out.println(s);
            }
        }
        return "ok";
    }

    @PostMapping("/test1")
    public String test1(@RequestBody DemoEObj demoEObj ){
        Map<Integer, String> stringMap = demoEObj.getStringMap();
        for (Map.Entry<Integer, String> integerStringEntry : stringMap.entrySet()) {
            System.out.println(integerStringEntry.getKey() + "：" + integerStringEntry.getValue());
        }

        Map<String, DemoDObj> demoDObjMap = demoEObj.getDemoDObjMap();
        for (Map.Entry<String, DemoDObj> stringDemoDObjEntry : demoDObjMap.entrySet()) {
            System.out.println(stringDemoDObjEntry.getKey() + "：" + stringDemoDObjEntry.getValue());
        }
        Car[] cars = demoEObj.getCars();
        for (Car car : cars) {
            System.out.println(car);
        }
        return "ok";
    }


}
