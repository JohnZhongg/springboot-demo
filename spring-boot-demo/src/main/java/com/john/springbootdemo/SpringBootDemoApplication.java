package com.john.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author JohnZhong
 */
@SpringBootApplication
@RestController
public class SpringBootDemoApplication {

    @GetMapping("greeting")
    public String greeting(){
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
}
