package com.example.mylibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/**
 * Created by Mahmud Basunia on 8/27/2017.
 */

public class HelloFriend extends LinearLayout {

    public HelloFriend(Context context) {
        super(context);
        init(context);
    }

    public HelloFriend(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public HelloFriend(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    void init(Context context){
        inflate(context, R.layout.activity_float, this);
    }
}
