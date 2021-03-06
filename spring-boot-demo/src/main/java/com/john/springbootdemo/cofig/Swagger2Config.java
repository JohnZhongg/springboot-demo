package com.john.springbootdemo.cofig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author: JohnZhong
 * @date: 2018/7/13 02:18
 * @description:
 */
@EnableSwagger2
@Configuration
@EnableWebMvc
public class Swagger2Config {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.john.springbootdemo.controller"))
                .paths(PathSelectors.any())
                .build();
    }
    // 一些接口文档信息的简介
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful APIs")
                .description("spring Boot 中构建RESTful API")
                .termsOfServiceUrl("")
                .contact("caizi")
                .version("1.0")
                .build();
    }

}
