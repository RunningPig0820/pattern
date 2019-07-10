package com.taosha.pattern.factory.lambda;

import com.taosha.pattern.factory.common.interfaces.Milk;
import com.taosha.pattern.factory.enums.MilkEnum;

import java.util.function.Supplier;

/**
 * @author zhangmin
 */
public interface Builder {
    void add(MilkEnum name, Supplier<Milk> supplier);
}
