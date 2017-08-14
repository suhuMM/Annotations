package com.suhu.app.base;

import android.support.v4.app.Fragment;
import android.view.View;

import com.suhu.library.IFLayout;


/**
 * Created by suhu on 2017/8/14.
 */

public class BaseFragment extends Fragment implements IFLayout{
    @Override
    public View inflateView(int layout) {
        return View.inflate(getActivity(), layout, null);
    }
}
