package com.example.user.uiautomator;

import android.support.test.uiautomator.UiAutomatorTestCase;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

/**
 * Created by user on 2017/11/21.
 */

public class UIObjectTest extends UiAutomatorTestCase {
   public void testUiObject() throws UiObjectNotFoundException {
       getUiDevice().waitForIdle(2000);
       UiObject obj=new UiObject(new UiSelector().resourceId("com.android.dialer:id/emptyListViewImage"));
       //向左滑动，参数为步数，既速度
       obj.swipeLeft(20);
       UiObject obj2 = new UiObject(new UiSelector().resourceId("com.android.dialer:id/emptyListViewImage"));
       if(obj2.exists()){
           obj2.swipeRight(20);
       }

       UiObject obj3=new UiObject(new UiSelector().resourceId("com.android.dialer:id/search_box_start_search"));
       obj3.clickAndWaitForNewWindow();
       new UiObject(new UiSelector().resourceId("com.android.dialer:id/search_view")).setText("10086");

       String str = new UiObject(new UiSelector().resourceId("com.android.dialer:id/cliv_name_textview")).getClassName();
       System.out.println("classname : ------"+str);
   }

}
