package com.john.springbootdemo.entity;

import java.util.List;

/**
 * @author: JohnZhong
 * @date: 2018/7/13 02:59
 * @description:
 */
public class DemoAObj {
    List<DemoBObj> demoBObjList;

    public List<DemoBObj> getDemoBObjList() {
        return demoBObjList;
    }

    public void setDemoBObjList(List<DemoBObj> demoBObjList) {
        this.demoBObjList = demoBObjList;
    }
}
