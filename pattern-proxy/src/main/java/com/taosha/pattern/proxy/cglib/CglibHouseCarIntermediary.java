package com.taosha.pattern.proxy.cglib;

import com.taosha.pattern.proxy.common.Person;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

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
public class CglibHouseCarIntermediary implements MethodInterceptor {

    public Object getInstance(Class<?> clazz) throws  Exception{

        Enhancer enhancer = new Enhancer();
        //要把哪个设置为即将生成的新类父类
        enhancer.setSuperclass(clazz);

        enhancer.setCallback(this);

        return  enhancer.create();

    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        //业务的增强
        System.out.println("从房源数据库中查找匹配的房子...");

        methodProxy.invokeSuper(o,objects);

        System.out.println("如果合适的话，就准备办事");
        return null;
    }
}
