package com.taosha.pattern.proxy.jdk;

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
 *
 *  原理：字节码重组
 *  1、拿到被代理对象的引用，并且获取到它的所有的接口，反射获取
 *  2、JDK Proxy类重新生成一个新的类、同时新的类要实现被代理类所有实现的所有的接口
 *  3、动态生成Java代码，把新加的业务逻辑方法由一定的逻辑代码去调用（在代码中体现）
 *  4、编译新生成的Java代码.class
 *  5、再重新加载到JVM中运行
 */
public class HouseIntermediary implements InvocationHandler {

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


