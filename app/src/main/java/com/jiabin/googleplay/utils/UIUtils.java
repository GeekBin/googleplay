package com.jiabin.googleplay.utils;

import android.content.Context;
import android.content.res.Resources;

import com.jiabin.googleplay.base.MyApplication;

/**
 * @author Administrator
 * @version $Rev$
 * @time 2016/5/10 9:34
 * @des 和UI相关的一些工具类
 * @updateAuthor $Author$
 * @updateDate $Data$
 * @updateDes ${TODO}$
 */
public class UIUtils {
    /**
     * 获得上下文
     */
    public static Context getContext(){
        return MyApplication.getContext();
    }

    /**
     * 得到Resources对象
     */
    public static Resources getResources(){
        return getContext().getResources();
    }

    /**
     * 得到string.xml中的字符
     */
    public static String getString(int resId){
        return getResources().getString(resId);
    }

    /**
     * 得到string.xml中的字符数组
     */
    public static String[] getStringArr(int resId){
        return getResources().getStringArray(resId);
    }

    /**
     * 获得color.xml中的颜色值
     */
    public static int getColor(int resId){
        return getResources().getColor(resId);
    }

    public static String getPackageName() {
        return getContext().getPackageName();
    }
}
