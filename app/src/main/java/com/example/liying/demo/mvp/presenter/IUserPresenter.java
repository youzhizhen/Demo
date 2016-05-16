package com.example.liying.demo.mvp.presenter;

import com.example.liying.demo.mvp.bean.UserBean;
import com.example.liying.demo.mvp.model.IUserModel;
import com.example.liying.demo.mvp.model.UserModel;
import com.example.liying.demo.mvp.view.IUserView;

/**
 * Created by LiYing on 2016/5/16.
 */
public class IUserPresenter {

    private IUserView mUserView;
    private IUserModel mUserModel;

    public IUserPresenter(IUserView view) {
        mUserView = view;
        mUserModel = new UserModel();
    }

    public void saveUser(int id, String firstName, String lastName) {
        mUserModel.setID(id);
        mUserModel.setFirstName(firstName);
        mUserModel.setLastName(lastName);
    }

    public void loadUser(int id) {
        UserBean user = mUserModel.load(id);
        mUserView.setFirstName(user.getFirstName()); // 通过调用IUserView的方法来更新显示
        mUserView.setLastName(user.getLastName());
    }
}
