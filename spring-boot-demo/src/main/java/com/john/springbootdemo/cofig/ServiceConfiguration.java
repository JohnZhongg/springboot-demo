package com.john.springbootdemo.cofig;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author JohnZhong
 *
 * service配置类，使用的XML的配置方式
 */
@Configuration
@ImportResource("classpath:applicationContext-service.xml")
public class ServiceConfiguration {
}
