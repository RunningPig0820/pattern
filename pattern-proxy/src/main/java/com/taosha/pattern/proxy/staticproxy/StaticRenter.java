package com.taosha.pattern.proxy.staticproxy;

import com.taosha.pattern.proxy.common.Person;

/**
 * @ClassName Renter
 * @Description 房屋租客
 * @Author zhangMin
 * @Date 2018/12/12 14:16
 * @Version 1.0
 **/
public class StaticRenter implements Person {

    public void rentHouse() {
        System.out.println("我想找个一室一厅一卫的房子");
    }

    public void buyCar() {
        System.out.println("我想找一个车子");
    }
}
