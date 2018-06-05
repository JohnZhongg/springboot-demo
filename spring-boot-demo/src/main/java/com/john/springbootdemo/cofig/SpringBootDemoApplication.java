package com.john.springbootdemo.cofig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author JohnZhong
 *
 *  This is the boot to run the spring-boot-starter-*.
 */
@Configuration
@EnableAutoConfiguration
@Import({ControllerConfiguration.class, ServiceConfiguration.class, DaoConfiguration.class, ComponentConfiguration.class})
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }
}
