package com.example.user.uiautomator;

import android.os.RemoteException;
import android.support.test.uiautomator.UiAutomatorTestCase;
import android.support.test.uiautomator.UiDevice;
import android.view.KeyEvent;

import java.io.File;

/**
 * Created by zhangjing on 2017/11/20.
 */

public class UiDeviceTest extends UiAutomatorTestCase {
    public void testUiDevice() throws RemoteException {

       UiDevice device=getUiDevice();
        //获取当前设备，点击home键
        //getUiDevice().pressHome();

        //等待2秒钟
       // getUiDevice().waitForIdle(2000);

        //getUiDevice().waitForIdle(2000);
        //获取当前设备，点击菜单键
        //getUiDevice().pressMenu();

       // getUiDevice().waitForIdle(2000);
        //获取当前设备，点击最近应用
       // getUiDevice().pressRecentApps();

      //  getUiDevice().waitForIdle(2000);

      //  getUiDevice().pressHome();

        //按坐标点击首页搜索框
        /*getUiDevice().click(400,100);

        getUiDevice().pressKeyCode(KeyEvent.KEYCODE_0);
        getUiDevice().pressKeyCode(KeyEvent.KEYCODE_1);
        getUiDevice().pressKeyCode(KeyEvent.KEYCODE_2);
        getUiDevice().pressKeyCode(KeyEvent.KEYCODE_3);
*
/
/*
        获取屏幕截图
        getUiDevice().takeScreenshot(new File("/sdcard/1.png"));
 */

        /*
        唤醒或者屏幕
        if(getUiDevice().isScreenOn()){
            getUiDevice().sleep();
        }
        getUiDevice().waitForIdle(2000);
        if (!getUiDevice().isScreenOn()){
            getUiDevice().wakeUp();
        }

         */


        /*
        UiDevice 的拖拽操作
         device.drag(500,900,200,500,50);
        device.waitForIdle(2000);
        device.drag(200,500,500,900,50);
         */


        /*
        UiDevice的滑动操作
        device.swipe(1200, 1500, 200, 1500, 20);
		device.waitForIdle(5000);
		device.swipe(200, 1500, 1200, 1500, 20);
         */
        
        /*
        快速打开通知栏
        快速打开设置按钮
         */
        device.openNotification();
        device.waitForIdle(2000);
        device.openQuickSettings();
    }

}
