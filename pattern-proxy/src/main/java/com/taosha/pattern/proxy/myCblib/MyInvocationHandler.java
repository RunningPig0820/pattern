package com.taosha.pattern.proxy.myCblib;

import java.lang.reflect.Method;

/**
 * @ClassName MyInvocationHander
 * @Description TODO
 * @Author zhangMin
 * @Date 2018/12/13 15:58
 * @Version 1.0
 **/
public interface MyInvocationHandler {
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}
