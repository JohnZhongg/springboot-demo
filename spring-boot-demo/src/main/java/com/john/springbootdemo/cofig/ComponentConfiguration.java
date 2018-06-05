package com.john.springbootdemo.cofig;

import com.john.springbootdemo.customUtils.MyHandlerExceptionResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;

/**
 * @author JohnZhong
 *  注册组件Bean
 */
@Configuration
@ComponentScan("com.john.springbootdemo.advice")
public class ComponentConfiguration {

    @Bean
    public HandlerExceptionResolver getHandlerExceptionResolver(){
        return new MyHandlerExceptionResolver();
    }
}
