package com.suhu.app;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.TextView;

import com.suhu.app.base.BaseActivity;
import com.suhu.library.BindView;
import com.suhu.library.SetLayout;

@SetLayout(R.layout.activity_main)
public class MainActivity extends BaseActivity implements View.OnClickListener{
    @BindView(R.id.text)
    private TextView textView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        textView.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        textView.setText("已经点击了");
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.frame,new FragmentTest());
        transaction.commit();
    }
}
