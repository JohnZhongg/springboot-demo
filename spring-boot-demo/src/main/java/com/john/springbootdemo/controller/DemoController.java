package com.john.springbootdemo.controller;

import com.john.springbootdemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    @GetMapping("/greeting")
    public String greeting(){
        return demoService.getGreetingInfo();
    }
}
