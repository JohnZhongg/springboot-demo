package com.john.springbootdemo.controller;

import com.john.springbootdemo.entity.DemoAObj;
import com.john.springbootdemo.entity.DemoBObj;
import com.john.springbootdemo.entity.DemoCObj;
import com.john.springbootdemo.entity.DemoDObj;
import com.john.springbootdemo.exception.MyException;
import com.john.springbootdemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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


}
