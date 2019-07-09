package com.taosha.pattern.proxy.jdk;

import com.taosha.pattern.proxy.common.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName CarIntermediary
 * @Description TODO
 * @Author zhangMin
 * @Date 2018/12/12 14:53
 * @Version 1.0
 **/
public class CarIntermediary implements InvocationHandler {
    private Person person;

    public Object getInstance(Person person) throws Exception{
        this.person = person;
        Class<?> clazz = person.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("从房源数据库中查找匹配的房子...");
        method.invoke(this.person,args);
        System.out.println("如果合适的话，出租");
        return null;
    }
}
