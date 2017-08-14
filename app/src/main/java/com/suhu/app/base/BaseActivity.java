package com.suhu.app.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.suhu.library.Annotation;
import com.suhu.library.IALayout;


/**
 * Created by suhu on 2017/8/14.
 */

public class BaseActivity extends AppCompatActivity implements IALayout{

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Annotation.init(this);
    }
}
