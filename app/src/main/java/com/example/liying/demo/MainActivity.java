package com.example.liying.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.liying.demo.mvp.presenter.IUserPresenter;
import com.example.liying.demo.mvp.view.IUserView;

public class MainActivity extends Activity implements View.OnClickListener, IUserView {

    IUserPresenter presenter;
    EditText id, first, last;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.save).setOnClickListener(this);
        findViewById(R.id.load).setOnClickListener(this);

        id = (EditText) findViewById(R.id.et_id);
        first = (EditText) findViewById(R.id.et_firstName);
        last = (EditText) findViewById(R.id.et_lastName);
        presenter = new IUserPresenter(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.save:
                presenter.saveUser(getID(), getFirstName(), getLastName());
                break;
            case R.id.load:
                presenter.loadUser(getID());
                break;
            default:
                break;
        }
    }

    @Override
    public int getID() {
        return new Integer(id.getText().toString());
    }

    @Override
    public String getFirstName() {
        return first.getText().toString();
    }

    @Override
    public String getLastName() {
        return last.getText().toString();
    }

    @Override
    public void setFirstName(String firstName) {
        first.setText(firstName);
    }

    @Override
    public void setLastName(String lastName) {
        last.setText(lastName);
    }

}