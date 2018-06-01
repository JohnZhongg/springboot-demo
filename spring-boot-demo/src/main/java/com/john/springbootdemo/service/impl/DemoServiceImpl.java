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
        return "Hello! The time is " + new SimpleDateFormat("yyyyMMdd HH:mm:ss").format(new Date()) + " now!";
    }
}
