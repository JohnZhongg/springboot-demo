package com.john.springbootdemo.cofig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author JohnZhong
 *
 * controller的配置类，使用的是类配置方式
 */
@Configuration
@ComponentScan(basePackages = "com.john.springbootdemo.controller")
public class ControllerConfiguration {

}
