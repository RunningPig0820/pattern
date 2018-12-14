package com.taosha.pattern.observer.observer;

import com.taosha.pattern.observer.common.Event;

/**
 * @ClassName Person
 * @Description TODO
 * @Author zhangMin
 * @Date 2018/12/14 15:46
 * @Version 1.0
 **/
public class Person implements Observer {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public void operation(Event event) {
        System.out.println(" 观察者 ： " + name + " 接收到信息 " + event.toString());
    }
}
