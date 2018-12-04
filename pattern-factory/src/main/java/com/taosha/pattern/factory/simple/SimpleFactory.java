package com.taosha.pattern.factory.simple;

import com.taosha.pattern.factory.common.Mengniu;
import com.taosha.pattern.factory.common.interfaces.Milk;
import com.taosha.pattern.factory.common.Telunsu;
import com.taosha.pattern.factory.common.Yili;
import com.taosha.pattern.factory.enums.MilkEnum;

/**
 * @ClassName 简单工厂
 * @Description 简单工厂模式的实质是由一个工厂类根据传入的参数，动态决定应该创建哪一个产品类。
 * @Author zhangmin
 * @Date 2018/12/4 10:22
 * @Version 1.0
 **/
public class SimpleFactory {

    /**
     * 每次新加产品时，都需要添加
     */
    public Milk getMilk(Enum enums){
        switch ((MilkEnum)enums) {
            case TE_LUN_SU:
                return new Telunsu();
            case YI_LI:
                return new Yili();
            case MENG_NIU :
                return new Mengniu();
            default:
                System.out.println("不能生产您所需的产品");
                return null;
        }

    }

}
