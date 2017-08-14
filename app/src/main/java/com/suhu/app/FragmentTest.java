package com.suhu.app;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.suhu.app.base.BaseFragment;
import com.suhu.library.Annotation;
import com.suhu.library.BindView;
import com.suhu.library.SetLayout;

/**
 * Created by suhu on 2017/8/14.
 */

@SetLayout(R.layout.fragment_layout)
public class FragmentTest extends BaseFragment{
    @BindView(R.id.text)
    private TextView textView;
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = Annotation.bind(this);
        textView.setText("我可以");
        return view;
    }
}
