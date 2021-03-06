package com.example.smartcity1_1.util;

import android.app.AlertDialog;
import android.content.Context;
import android.widget.Toast;

import com.example.smartcity1_1.net.VolleyTo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Login Name win10
 * @Create by 张瀛煜 on 2020/10/1 at 19:34
 */
public class Uitls {
    private static Toast toast;

    public static void showDialog(String msg, Context context) {
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("提示");
        builder.setMessage(msg);
        builder.setPositiveButton("确定", null);
        builder.show();
    }

    public static void showToast(String msg, Context context) {
        if (toast == null) {
            toast = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
        }
        toast.setText(msg);
        toast.show();
    }

    public static String simpleDate(String type, Date date){
        SimpleDateFormat format = new SimpleDateFormat(type);
        return format.format(date);
    }



}
