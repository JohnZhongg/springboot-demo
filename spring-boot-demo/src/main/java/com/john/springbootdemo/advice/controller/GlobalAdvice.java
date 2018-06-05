package com.john.springbootdemo.advice.controller;

import com.john.springbootdemo.vo.Result;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author JohnZhong
 *
 * 第一个advice
 */
@RestControllerAdvice("com.john.springbootdemo.controller")
public class GlobalAdvice {


    @ExceptionHandler
    public Result handlerGlobalException(Exception ex){
        ex.printStackTrace();
        return Result.fail(ex.getMessage());
    }
}
