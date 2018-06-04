package com.john.springbootdemo.controller;

import com.john.springbootdemo.exception.MyException;
import com.john.springbootdemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


}
