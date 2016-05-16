package com.example.liying.demo.mvp.model;

import com.example.liying.demo.mvp.bean.UserBean;

/**
 * Created by LiYing on 2016/5/16.
 */
public interface IUserModel {

    void setID(int id);

    void setFirstName(String firstName);

    void setLastName(String lastName);

    int getID();

    UserBean load(int id);// 通过id读取user信息,返回一个UserBean
}
