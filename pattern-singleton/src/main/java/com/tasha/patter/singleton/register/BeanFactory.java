package com.tasha.patter.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName BeanFactory
 * @Description 注册式单例
 * @Author zhangMin
 * @Date 2018/12/11 21:13
 * @Version 1.0
 **/
public class BeanFactory {

    private BeanFactory(){}

    /**
     *   线程安全
     **/
    private static Map<String,Object> ioc = new ConcurrentHashMap<String,Object>();

    public static Object getBean(String className){

        if(!ioc.containsKey(className)){
            Object obj = null;
            try {
                obj = Class.forName(className).newInstance();
                ioc.put(className,obj);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return obj;
        }else{
            return ioc.get(className);
        }

    }
}
