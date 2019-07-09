package com.tasha.patter.singleton.register;

/**
 * @ClassName EnumSinfle
 * @Description 常量中去使用，常量不就是用来大家都能够共用吗？
 * 通常在通用API中使用
 * @Author zhangMin
 * @Date 2018/12/11 21:16
 * @Version 1.0
 **/
public enum EnumSinfle {
    RED(){
        private int r = 255;
        private int g = 0;
        private int b = 0;

    },BLACK(){
        private int r = 0;
        private int g = 0;
        private int b = 0;
    },WHITE(){
        private int r = 255;
        private int g = 255;
        private int b = 255;
    };
}
