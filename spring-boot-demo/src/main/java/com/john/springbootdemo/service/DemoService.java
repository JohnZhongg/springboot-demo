package com.john.springbootdemo.service;


/**
 * @author JohnZhong
 * 测试service
 */
public interface DemoService {

    /**
     *  获取greeting的信息
     * @return 信息
     */
    String getGreetingInfo();

    /**
     *  根据不同对象吃不同的食物
     * @return 返回吃的食物
     * @param animal 传入的动物
     */
    String eating(String animal);

}
