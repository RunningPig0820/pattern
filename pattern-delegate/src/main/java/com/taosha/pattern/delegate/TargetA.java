package com.taosha.pattern.delegate;

/**
 * @ClassName TargetA
 * @Description TODO
 * @Author zhangMin
 * @Date 2018/12/21 10:56
 * @Version 1.0
 **/
public class TargetA implements Target {
    public void doing(String command) {
        System.out.println("我是员工B，我现在开始干" + command + "工作");
    }
}
