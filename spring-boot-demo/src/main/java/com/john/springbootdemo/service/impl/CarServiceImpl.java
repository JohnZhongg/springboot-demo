package com.john.springbootdemo.service.impl;

import com.john.springbootdemo.dao.CarMapper;
import com.john.springbootdemo.entity.Car;
import com.john.springbootdemo.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author JohnZhong
 *
 * CarService的实现类
 */
@Service
public class CarServiceImpl implements CarService {
    @Autowired
    CarMapper carMapper;


    @Override
    public void add(Car car) {
        carMapper.insert(car);
    }

    @Override
    public List<Car> listAll() {
        return carMapper.selectByExample(null);
    }
}
