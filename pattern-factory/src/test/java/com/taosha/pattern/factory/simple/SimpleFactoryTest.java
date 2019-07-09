package com.taosha.pattern.factory.simple;

import com.taosha.pattern.factory.common.Mengniu;
import com.taosha.pattern.factory.enums.MilkEnum;
import org.junit.Assert;
import org.junit.Test;



/**
 * @ClassName SimpleFacetoryTest
 * @Description TODO
 * @Author zhangMin
 * @Date 2018/12/4 10:50
 * @Version 1.0
 **/
public class SimpleFactoryTest {

    @Test
    public void test_simple_factory() {
        SimpleFactory simpleFactory = new SimpleFactory();
        Assert.assertTrue(simpleFactory.getMilk(MilkEnum.MENG_NIU) instanceof Mengniu);
        Assert.assertEquals("蒙牛", simpleFactory.getMilk(MilkEnum.MENG_NIU).getName());
    }
}