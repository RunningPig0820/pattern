package com.taosha.pattern.factory.abstr;

import com.taosha.pattern.factory.common.interfaces.Milk;

/**
 *
 * 抽象工厂是用户的主入口
 * 在Spring中应用得最为广泛的一种设计模式
 * 易于扩展 符合 开-闭原则
 *
 * AbstractFactory是提供给工厂创建者的规范
 * 调用者是不关心具体的创建过程的
 */
public abstract class AbstractFactory {
    //公共的逻辑 方便于统一管理
    /**
     * 获得一个品牌的牛奶
     */
    public abstract Milk getMilk();

}
