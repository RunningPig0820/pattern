package com.tasha.patter.singleton.lazy;

/**
 * @ClassName LazyTwo
 * @Description TODO
 * @Author zhangMin
 * @Date 2018/12/6 21:16
 * @Version 1.0
 **/
public class LazyTwo {
    private LazyTwo(){}

    private static LazyTwo lazy = null;

    //通过加锁防止多个现成进入
    public static synchronized LazyTwo getInstance(){
        if(lazy == null){
            lazy = new LazyTwo();
        }
        return lazy;

    }
}
