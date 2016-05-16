package com.example.liying.demo.mvp.view;

/**
 * Created by LiYing on 2016/5/16.
 * 建立view（更新ui中的view状态），这里列出需要操作当前view的方法，也是接口
 */
public interface IUserView {
    int getID();

    String getFirstName();

    String getLastName();

    void setFirstName(String firstName);

    void setLastName(String lastName);
}
