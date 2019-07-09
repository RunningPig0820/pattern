package com.tasha.patter.singleton.register;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName RegisterMap
 * @Description TODO
 * @Author zhangMin
 * @Date 2018/12/11 21:19
 * @Version 1.0
 **/
public class RegisterMap {
    private RegisterMap(){}

    private static Map<String,Object> register = new ConcurrentHashMap<String,Object>();

    public static RegisterMap getInstance(String name){
        if(name == null){
            name = RegisterMap.class.getName();
        }

        if(register.get(name) == null){
            try {
                register.put(name, new RegisterMap());
            }catch(Exception e){
                e.printStackTrace();
            }

        }
        return (RegisterMap)register.get(name);
    }
}
