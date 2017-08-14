package com.suhu.app.core;

import android.view.View;

import java.lang.reflect.Field;

/**
 * Created by suhu on 2017/8/14.
 */

public class Annotation {

    /**
     * @method 在activity中使用初始化
     * @author suhu
     * @time 2017/8/14 13:10
     * @param layout
     */
    public static void init(IALayout layout) {
        SetLayout sLt = layout.getClass().getAnnotation(SetLayout.class);
        if (sLt != null) {
            layout.setContentView(sLt.value());
        }
        Field[] fields = layout.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.getAnnotations() != null) {
                if (field.isAnnotationPresent(BindView.class)) {
                    field.setAccessible(true);
                    BindView bindView = field.getAnnotation(BindView.class);
                    try {
                        field.set(layout, layout.findViewById(bindView.value()));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }


    /**
     *@method 在Fragment中使用
     *@author suhu
     *@time 2017/8/14 13:42
     *@param layout
     *
    */
    public static View bind(IFLayout layout) {
        View view = null;
        SetLayout sLt = layout.getClass().getAnnotation(SetLayout.class);
        if (sLt != null) {
            view = layout.inflateView(sLt.value());
        }
        Field[] fields = layout.getClass().getDeclaredFields();
        for (Field field : fields) {
            if (field.getAnnotations() != null) {
                if (field.isAnnotationPresent(BindView.class)) {
                    field.setAccessible(true);
                    BindView bindView = field.getAnnotation(BindView.class);
                    if (view != null) {
                        try {
                            field.set(layout, view.findViewById(bindView.value()));
                        } catch (IllegalAccessException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
        return view;
    }

}
