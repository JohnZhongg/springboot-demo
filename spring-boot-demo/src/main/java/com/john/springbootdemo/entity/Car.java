package com.john.springbootdemo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

/**
 * Created By MBG-GUI-EXTENSION https://github.com/spawpaw/mybatis-generator-gui-extension
 * Description:
 * 
 *
 * @author 
 */
@ApiModel(value = "车辆实体", description = "封装车辆信息")
public class Car implements Serializable {
    /**
     *
     *
     * @mbg.generated Mon Jun 04 17:39:28 CST 2018
     */
    @ApiModelProperty(value = "id", notes = "主键")
    private Integer id;

    /**
     *
     *
     * @mbg.generated Mon Jun 04 17:39:28 CST 2018
     */
    @ApiModelProperty(value = "车辆类型", notes = "车型")
    private String carType;

    /**
     *
     *
     * @mbg.generated Mon Jun 04 17:39:28 CST 2018
     */
    @ApiModelProperty(value = "描述", notes = "对于车辆的详细描述")
    private String desc;

    /**
     *
     * @mbg.generated Mon Jun 04 17:39:28 CST 2018
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method returns the value of the database column t_car.t_id
     *
     * @return the value of t_car.t_id
     *
     * @mbg.generated Mon Jun 04 17:39:28 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     *
     * @mbg.generated Mon Jun 04 17:39:28 CST 2018
     */
    public Car withId(Integer id) {
        this.setId(id);
        return this;
    }

    /**
     * This method sets the value of the database column t_car.t_id
     *
     * @param id the value for t_car.t_id
     *
     * @mbg.generated Mon Jun 04 17:39:28 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method returns the value of the database column t_car.t_carType
     *
     * @return the value of t_car.t_carType
     *
     * @mbg.generated Mon Jun 04 17:39:28 CST 2018
     */
    public String getCarType() {
        return carType;
    }

    /**
     *
     * @mbg.generated Mon Jun 04 17:39:28 CST 2018
     */
    public Car withCarType(String carType) {
        this.setCarType(carType);
        return this;
    }

    /**
     * This method sets the value of the database column t_car.t_carType
     *
     * @param carType the value for t_car.t_carType
     *
     * @mbg.generated Mon Jun 04 17:39:28 CST 2018
     */
    public void setCarType(String carType) {
        this.carType = carType;
    }

    /**
     * This method returns the value of the database column t_car.t_desc
     *
     * @return the value of t_car.t_desc
     *
     * @mbg.generated Mon Jun 04 17:39:28 CST 2018
     */
    public String getDesc() {
        return desc;
    }

    /**
     *
     * @mbg.generated Mon Jun 04 17:39:28 CST 2018
     */
    public Car withDesc(String desc) {
        this.setDesc(desc);
        return this;
    }

    /**
     * This method sets the value of the database column t_car.t_desc
     *
     * @param desc the value for t_car.t_desc
     *
     * @mbg.generated Mon Jun 04 17:39:28 CST 2018
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }

    /**
     *
     * @mbg.generated Mon Jun 04 17:39:28 CST 2018
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", carType=").append(carType);
        sb.append(", desc=").append(desc);
        sb.append("]");
        return sb.toString();
    }

    /**
     *
     * @mbg.generated Mon Jun 04 17:39:28 CST 2018
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Car other = (Car) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCarType() == null ? other.getCarType() == null : this.getCarType().equals(other.getCarType()))
            && (this.getDesc() == null ? other.getDesc() == null : this.getDesc().equals(other.getDesc()));
    }

    /**
     *
     * @mbg.generated Mon Jun 04 17:39:28 CST 2018
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCarType() == null) ? 0 : getCarType().hashCode());
        result = prime * result + ((getDesc() == null) ? 0 : getDesc().hashCode());
        return result;
    }
}