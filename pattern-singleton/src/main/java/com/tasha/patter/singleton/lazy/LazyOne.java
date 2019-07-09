package com.tasha.patter.singleton.lazy;

/**
 * @ClassName LazyO
 * @Description TODO
 * @Author zhangMin
 * @Date 2018/12/6 21:12
 * @Version 1.0
 **/

/**
 * 懒汉式单例
 * 在外部需要使用的时候才进行实例化
 */
public class LazyOne {
    /**
     *  静态块，公共内存区域
     */
    private static LazyOne lazy = null;

    private LazyOne(){}

    public static LazyOne getInstance(){

        //调用方法之前，先判断
        //如果没有初始化，将其进行初始化,并且赋值
        //如果已经初始化，直接返回之前已经保存好的结果
        //将该实例缓存好
        if(lazy == null){
            //两个线程都会进入里面
            lazy = new LazyOne();
        }
        return lazy;

    }
}
