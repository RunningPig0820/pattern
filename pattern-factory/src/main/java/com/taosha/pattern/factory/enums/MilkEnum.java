package com.taosha.pattern.factory.enums;

import jdk.nashorn.internal.objects.annotations.Getter;

/**
 * @ClassName MilkEnum
 * @Description 牛奶枚举类
 * @Author zhangMin
 * @Date 2018/12/4 10:32
 * @Version 1.0
 **/

public enum MilkEnum {

    //蒙牛
    MENG_NIU("蒙牛"),
    //三鹿
    SAN_LU("三鹿"),
    //特仑苏
    TE_LUN_SU("特仑苏"),
    //伊利
    YI_LI("伊利");

    String name ;
    MilkEnum(String name) {
        this.name = name;
    }
}
