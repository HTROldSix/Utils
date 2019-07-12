package com.oldsix.utils;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.Build;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

import java.util.ArrayList;
import java.util.List;

/**
 * 检查并且申请动态权限
 */
public class PermissionUtils {

    /**
     * 检查未授权的权限
     *
     * @param activity    目标activity
     * @param permissions 应用所需权限数组
     * @return 未授权的权限组，若为 null 或者数组长度为0，即已获得所需的全部授权
     */
    public static String[] checkPermissions(Activity activity, String[] permissions) {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.M) {
            return null;
        }
        List<String> permissionsList = new ArrayList<>();
        for (String permission : permissions) {
            if (ContextCompat.checkSelfPermission(activity, permission) != PackageManager.PERMISSION_GRANTED) {
                permissionsList.add(permission);
            }
        }
        return (String[]) permissionsList.toArray();
    }

    /**
     * 申请权限
     *
     * @param activity    目标activity
     * @param permissions 应用所需权限数组
     * @param requestCode 请求码，应 >= 0
     */
    public static void requestPermissions(Activity activity, String[] permissions, int requestCode) {
        ActivityCompat.requestPermissions(activity, permissions, requestCode);
    }

}
