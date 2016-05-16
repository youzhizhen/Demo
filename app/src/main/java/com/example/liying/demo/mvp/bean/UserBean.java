package com.example.liying.demo.mvp.bean;

/**
 * Created by LiYing on 2016/5/16.
 */
public class UserBean {

    private String mFirstName;
    private String mLastName;

    public UserBean(String firstName, String lastName) {
        this.mFirstName = firstName;
        this.mLastName = lastName;
    }

    public String getFirstName() {
        return mFirstName;
    }

    public String getLastName() {
        return mLastName;
    }
}
