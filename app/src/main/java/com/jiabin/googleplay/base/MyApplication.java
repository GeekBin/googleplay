package com.jiabin.googleplay.base;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

/**
 * @author Administrator
 * @version $Rev$
 * @time 2016/5/9 22:54
 * @des 全局，单例，用于存放一些全局的方法，属性
 * @updateAuthor GeekBin
 * @updateDate $Data$
 * @updateDes ${TODO}$
 */
public class MyApplication extends Application {

    private static Context mContext;

    /**
     * 得到上下文
     * @return
     */
    public static Context getContext() {
        return mContext;
    }

    /**
     * 得到主线程id
     * @return
     */
    public static long getMainThreadId() {
        return mMainThreadId;
    }

    /**
     * 得到主线程的Handler
     * @return
     */
    public static Handler getHandler() {
        return mHandler;
    }

    private static Handler mHandler;
    private static long mMainThreadId;


    @Override
    public void onCreate() {    //程序的入口方法
        /*-------------创建应用里面需要用到的一些共同属性------------*/
        //1.整个App的上下文
        mContext = getApplicationContext();

        //2.主线程Handler对象
        mHandler = new Handler();

        //3.应用程序的主线程id
        mMainThreadId = android.os.Process.myTid();

        /**
         * Tid:ThreadId--线程id
         * Pid:ProcessId--进程id
         * Uid:UserId --用户id
         */
        super.onCreate();
    }
}
