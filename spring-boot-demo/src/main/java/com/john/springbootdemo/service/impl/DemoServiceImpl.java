package com.john.springbootdemo.service.impl;

import com.john.springbootdemo.service.DemoService;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author JohnZhong
 *
 * demo service implement
 */
@Service
public class DemoServiceImpl implements DemoService {

    @Override
    public String getGreetingInfo() {
        return "Welcome! The time is " + new SimpleDateFormat("yyyyMMdd HH:mm:ss").format(new Date()) + " now!";
    }


    @Override
    public String eating(String animal) {
        if("person".equals(animal)){
            return "大米";
        }else if("cat".equals(animal)){
            return "鱼";
        }else if("dog".equals(animal)){
            return "骨头";
        }else{
            return "未知食物";
        }
    }
}
