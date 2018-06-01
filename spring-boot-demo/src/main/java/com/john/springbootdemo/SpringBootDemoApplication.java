package com.john.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author JohnZhong
 *
 *  This is the boot to run the spring-boot-starter-*.
 */
@SpringBootApplication(scanBasePackages = {"com.john.springbootdemo.controller", "com.john.springbootdemo.service"})
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
}
