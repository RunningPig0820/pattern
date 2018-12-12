package com.taosha.pattern.proxy.staticproxy;

import com.taosha.pattern.proxy.common.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName Intermediary
 * @Description 房屋中介
 * @Author zhangMin
 * @Date 2018/12/12 14:21
 * @Version 1.0
 **/
public class StaticHouseIntermediary {

    public void rentHouse(Person person) {
        System.out.println("从房源数据库中查找匹配的房子...");
        person.rentHouse();
        System.out.println("如果合适的话，出租");
    }
}
