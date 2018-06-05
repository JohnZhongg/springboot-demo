package com.john.springbootdemo.cofig;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author JohnZhong
 *  Dao层的配置
 */
@Configuration
@MapperScan(basePackages = "com.john.springbootdemo.dao")
public class DaoConfiguration {

}
