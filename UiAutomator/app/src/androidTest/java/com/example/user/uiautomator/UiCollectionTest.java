package com.example.user.uiautomator;

import android.support.test.uiautomator.*;
import android.support.test.uiautomator.UiObject;

/**
 * Created by user on 2017/11/21.
 */

public class UiCollectionTest extends UiAutomatorTestCase {
    public void testUiCollection() throws UiObjectNotFoundException {
        /*
        在Android studio中使用UI自动化测试时，第一句首先要getUiDevice().waitForIdle(2000);
         */
        getUiDevice().waitForIdle(2000);

        /*
        在计算器模块中，数字部分是一个viewGroup，操作符是一个ViewGroup,
        首先将两个viewGroup中的对象集合到一个UICollection中，在使用getChildByText得到其下面的子对象
         */
        UiCollection colletionNum=new UiCollection(new UiSelector().resourceId("com.android.calculator2:id/pad_numeric"));
        UiObject btn5=colletionNum.getChildByText(new UiSelector().className("android.widget.Button"),"5");
        UiObject btn6=colletionNum.getChildByText(new UiSelector().className("android.widget.Button"),"6");
        UiObject btn7=colletionNum.getChildByText(new UiSelector().className("android.widget.Button"),"7");
        UiObject btn8=colletionNum.getChildByText(new UiSelector().className("android.widget.Button"),"8");
        UiObject equals=colletionNum.getChildByDescription(new UiSelector().className("android.widget.Button"),"equals");

        UiCollection colletionMark=new UiCollection(new UiSelector().resourceId("com.android.calculator2:id/pad_operator"));
        UiObject multiply=colletionMark.getChildByDescription(new UiSelector().className("android.widget.Button"),"times");

        btn5.click();
        btn6.click();
        multiply.click();
        btn7.click();
        btn8.click();
        equals.click();



    }
}
