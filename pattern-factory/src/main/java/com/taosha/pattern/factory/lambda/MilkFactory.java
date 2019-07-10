package com.taosha.pattern.factory.lambda;

import com.taosha.pattern.factory.common.Sanlu;
import com.taosha.pattern.factory.common.Telunsu;
import com.taosha.pattern.factory.common.Yili;
import com.taosha.pattern.factory.common.interfaces.Milk;
import com.taosha.pattern.factory.enums.MilkEnum;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * @Description :
 * @Author : zhangmin
 * @Data 2019-07-09 4:42 PM
 **/
public interface MilkFactory {

    Milk create(MilkEnum name);

    static MilkFactory factory(Consumer<Builder> consumer) {
        Map<MilkEnum, Supplier<Milk>> map = new HashMap<>();
        consumer.accept(map::put);
        return name -> map.get(name).get();
    }

}
