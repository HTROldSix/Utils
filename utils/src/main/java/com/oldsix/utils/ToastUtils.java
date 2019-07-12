package com.oldsix.utils;

import android.content.Context;
import android.widget.Toast;

public class ToastUtils {

    /**
     * 设置Long Toast ，源码中看这个时长对应 Toast.LONG_DURATION_TIMEOUT 是7000ms
     *
     * @param context 目标context
     * @param text    显示文本
     */
    public static void showLongToast(Context context, CharSequence text) {
        Toast.makeText(context, text, Toast.LENGTH_LONG).show();
    }


    /**
     * 设置 Short Toast ，源码中看这个时长对应 Toast.SHORT_DURATION_TIMEOUT 是4000ms
     *
     * @param context 目标context
     * @param text    显示文本
     */
    public static void showShortToast(Context context, CharSequence text) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }
}
