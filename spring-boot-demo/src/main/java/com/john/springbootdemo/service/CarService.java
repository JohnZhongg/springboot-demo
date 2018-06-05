package com.john.springbootdemo.service;

import com.john.springbootdemo.entity.Car;

import java.util.List;

/**
 * @author JohnZhong
 *
 * CarService
 */
public interface CarService {
    /**
     *  增加一个Car
     * @param car 新增的Car
     */
    void add(Car car);

    /**
     *  查找所有的Car
     * @return 返回的所有Car
     */
    List<Car> listAll();


    /**
     * 根据id删除一个Car
     * @param id
     */
    void deleteOne(Integer id);


    /**
     * 根据id跟新一个Car
     * @param car
     */
    void updateOne(Car car);


    /**
     * 根据id查找一个Car
     * @param id
     * @return
     */
    Car queryOne(Integer id);
}
