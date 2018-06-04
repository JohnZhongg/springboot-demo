package com.john.springbootdemo.exception;

/**
 * @author JohnZhong
 * 自定义异常
 */
public class MyException extends RuntimeException {
    public MyException() {
        super("My Exception!");
    }
}
