package com.example.smartcity1_1.net;

import com.android.volley.VolleyError;

import org.json.JSONObject;

/**
 * @Login Name win10
 * @Create by 张瀛煜 on 2020/10/1 at 19:02
 */
public interface VolleyLo {
    void onResponse(JSONObject jsonObject);
    void onErrorResponse(VolleyError volleyError);
}
