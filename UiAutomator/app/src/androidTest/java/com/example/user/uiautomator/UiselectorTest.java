package com.example.user.uiautomator;

import android.support.test.uiautomator.UiAutomatorTestCase;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import android.support.test.uiautomator.UiObject;
/**
 * Created by zhangjing on 2017/11/20.
 */

public class UiselectorTest extends UiAutomatorTestCase {
    public void testUiSelector() throws UiObjectNotFoundException {
        getUiDevice().pressHome();
        /*
        new UiSelector().textContains()方法表示包含某个文本
        UiSelector selector=new UiSelector().textContains("Phon");
         */

        /*
        使用uiautomatorviewer 查看每个元素信息，text对应"text"
        第一种匹配直接使用UiSelector().text()，此为完全匹配
        UiSelector selector=new UiSelector().text("Phone");
        */
        /*
        该方法表示使用正则表达式，匹配正则表达式
         UiSelector selector=new UiSelector().textMatches("*.on.*");
         */
        /*
        该方法表示所查询的内容以某些字符开始，头匹配
         UiSelector selector=new UiSelector().textStartsWith("Ph");
         */
       /*
       使用new UISelector().description(),方法，对应于viewer中的content-desc
       方法与上述的text方法一致
        UiSelector selector1=new UiSelector().description("Phone");
        UiSelector selector2=new UiSelector().descriptionContains("one");
        UiSelector selector3=new UiSelector().descriptionMatches("*.on.*");
        UiSelector selector4=new UiSelector().descriptionStartsWith("Ph");
        */

       /*
       通过resourceID匹配，对应resource-id
       UiSelector selector=new UiSelector().resourceId("com.android.launcher3:id/icon");
        */

       /*
       通过class-name来匹配，对应class

        UiSelector selector=new UiSelector().className("android.widget.TextView");
        */

       /*
       通过package来匹配，对应packeage

        UiSelector selector =new UiSelector().packageName("com.android.launcher3");
        */

       /*

       若存在className存在多个相同的情况下，我们可以使用标注下标的方式来选择具体的控件

       index:表示从当前的viewGroup选择下标
        */

       UiSelector selector=new UiSelector().className("android.widget.TextView").index(2);

       //UiSelector selector=new UiSelector().className("android.widget.TextView").childSelector(new UiSelector().index(0));

       UiObject btn=new UiObject(selector);
        btn.click();













}
}