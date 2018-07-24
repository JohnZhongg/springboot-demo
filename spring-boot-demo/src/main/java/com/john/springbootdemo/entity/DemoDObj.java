package com.john.springbootdemo.entity;

import java.util.List;

/**
 * @author: JohnZhong
 * @date: 2018/7/13 02:59
 * @description:
 */
public class DemoDObj {

    private List<String> list;

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "DemoDObj{" +
                "list=" + list +
                '}';
    }
}
