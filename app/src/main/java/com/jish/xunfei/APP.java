package com.jish.xunfei;

import android.app.Application;

import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechUtility;

/**
 * Created by Adminjs on 2018/2/7.
 */

public class APP extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
// 将“12345678”替换成您申请的APPID，申请地址：http://open.voicecloud.cn
        SpeechUtility.createUtility(this, SpeechConstant.APPID +"=5a7a7118");
    }
}

