package com.example.mahmudbasunia.modulemodule;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.mylibrary.HelloFriend;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HelloFriend myView = new HelloFriend(this);
        setContentView(myView);
    }
}
