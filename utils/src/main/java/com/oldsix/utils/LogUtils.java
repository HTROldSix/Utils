package com.oldsix.utils;

import android.util.Log;

public class LogUtils {

    public static String TAG = "LogUtils";

    public static boolean INFO = true;
    public static boolean DEBUG = true;
    public static boolean WARN = true;
    public static boolean ERROR = true;

    public static void i(String tag, String msg) {
        if (INFO) Log.i(tag, msg);
    }

    public static void i(String msg) {
        if (INFO) Log.i(TAG, msg);
    }

    public static void d(String tag, String msg) {
        if (DEBUG) Log.d(tag, msg);
    }

    public static void d(String msg) {
        if (DEBUG) Log.d(TAG, msg);
    }

    public static void w(String tag, String msg) {
        if (WARN) Log.w(tag, msg);
    }

    public static void w(String msg) {
        if (WARN) Log.w(TAG, msg);
    }

    public static void e(String tag, String msg) {
        if (ERROR) Log.e(tag, msg);
    }

    public static void e(String msg) {
        if (ERROR) Log.e(TAG, msg);
    }

}