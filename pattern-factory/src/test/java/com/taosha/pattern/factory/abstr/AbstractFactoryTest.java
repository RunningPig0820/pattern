package com.taosha.pattern.factory.abstr;

import com.taosha.pattern.factory.common.Mengniu;
import org.junit.Assert;
import org.junit.Test;

/**
 * @ClassName AbstractFactory
 * @Description TODO
 * @Author zhangMin
 * @Date 2018/12/4 11:32
 * @Version 1.0
 **/
public class AbstractFactoryTest {

    @Test
    public void test_abstract_factory(){
        AbstractFactory abstractFactory = new MengNiuFactory();
        Assert.assertTrue(abstractFactory.getMilk() instanceof Mengniu);
        Assert.assertEquals("蒙牛", abstractFactory.getMilk().getName());
    }
}
