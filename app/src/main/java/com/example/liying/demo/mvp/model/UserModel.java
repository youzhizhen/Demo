package com.example.liying.demo.mvp.model;

import com.example.liying.demo.mvp.bean.UserBean;

/**
 * Created by LiYing on 2016/5/16.
 *
 * 业务逻辑的处理（数据从数据库或后台服务的获取和存储）
 *
 */
public class UserModel implements IUserModel {
    @Override
    public void setID(int id) {
        System.out.println("set model id:" + id);
    }

    @Override
    public void setFirstName(String firstName) {
        System.out.println("set model firstName:" + firstName);
    }

    @Override
    public void setLastName(String lastName) {
        System.out.println("set model lastName:" + lastName);
    }

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public UserBean load(int id) {
        UserBean bean = new UserBean("Li", "ying");
        return bean;
    }
}
