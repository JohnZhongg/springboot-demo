package com.john.springbootdemo.dao;

import com.john.springbootdemo.entity.Car;
import com.john.springbootdemo.entity.CarExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CarMapper {
    /**
     *
     * @mbg.generated Mon Jun 04 17:39:28 CST 2018
     */
    long countByExample(CarExample example);

    /**
     *
     * @mbg.generated Mon Jun 04 17:39:28 CST 2018
     */
    int deleteByExample(CarExample example);

    /**
     *
     * @mbg.generated Mon Jun 04 17:39:28 CST 2018
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Mon Jun 04 17:39:28 CST 2018
     */
    int insert(Car record);

    /**
     *
     * @mbg.generated Mon Jun 04 17:39:28 CST 2018
     */
    int insertSelective(Car record);

    /**
     *
     * @mbg.generated Mon Jun 04 17:39:28 CST 2018
     */
    List<Car> selectByExample(CarExample example);

    /**
     *
     * @mbg.generated Mon Jun 04 17:39:28 CST 2018
     */
    Car selectByPrimaryKey(Integer id);

    /**
     *
     * @mbg.generated Mon Jun 04 17:39:28 CST 2018
     */
    int updateByExampleSelective(@Param("record") Car record, @Param("example") CarExample example);

    /**
     *
     * @mbg.generated Mon Jun 04 17:39:28 CST 2018
     */
    int updateByExample(@Param("record") Car record, @Param("example") CarExample example);

    /**
     *
     * @mbg.generated Mon Jun 04 17:39:28 CST 2018
     */
    int updateByPrimaryKeySelective(Car record);

    /**
     *
     * @mbg.generated Mon Jun 04 17:39:28 CST 2018
     */
    int updateByPrimaryKey(Car record);
}