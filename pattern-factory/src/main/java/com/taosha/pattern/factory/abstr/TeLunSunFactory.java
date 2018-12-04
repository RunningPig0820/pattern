package com.taosha.pattern.factory.abstr;

import com.taosha.pattern.factory.common.Telunsu;
import com.taosha.pattern.factory.common.Yili;
import com.taosha.pattern.factory.common.interfaces.Milk;

/**
 * @ClassName YiLiFactory
 * @Description 特仑苏工厂
 * @Author zhangMin
 * @Date 2018/12/4 11:28
 * @Version 1.0
 **/
public class TeLunSunFactory extends AbstractFactory {
    @Override
    public Milk getMilk() {
        return new Telunsu();
    }
}
