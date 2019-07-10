package com.taosha.pattern.factory.lambda;

import com.taosha.pattern.factory.common.Mengniu;
import com.taosha.pattern.factory.common.Sanlu;
import com.taosha.pattern.factory.common.Telunsu;
import com.taosha.pattern.factory.common.Yili;
import com.taosha.pattern.factory.common.interfaces.Milk;
import com.taosha.pattern.factory.enums.MilkEnum;
import com.taosha.pattern.factory.simple.SimpleFactory;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.*;

/**
 * @Description :
 * @Author : zhangmin
 * @Data 2019-07-09 4:47 PM
 **/
public class test {

    @Test
    public void test_simple_factory() {

        Builder builder1 = null;
        builder1.add(MilkEnum.MENG_NIU, Sanlu::new);

        Consumer<Builder> consumer = (Builder builder)->{
            builder.add(MilkEnum.MENG_NIU, Sanlu::new);
            builder.add(MilkEnum.SAN_LU, Sanlu::new);
            builder.add(MilkEnum.YI_LI, Yili::new);
            builder.add(MilkEnum.TE_LUN_SU, Telunsu::new);
        };
        MilkFactory factory = MilkFactory.factory(consumer);
        Milk milk = factory.create(MilkEnum.MENG_NIU);
        System.out.println(milk.getName());
    }

    @Test
    public void test1(){
        // 方法引用，调用打印方法
        Consumer<String> consumer = System.out::println;
        consumer.accept("接收的数据");

        // 静态方法引用，通过类名即可调用
        Consumer<Dog> consumer2 = Dog::bark;
        consumer2.accept(new Dog());

        // 实例方法引用，通过对象实例进行引用
        Dog dog = new Dog();
        IntUnaryOperator function = dog::eat;
        System.out.println("还剩下" + function.applyAsInt(2) + "斤");

        // 另一种通过实例方法引用的方式，之所以可以这么干是因为JDK默认会把当前实例传入到非静态方法，参数名为this，参数位置为第一个，所以我们在非静态方法中才能访问this，那么就可以通过BiFunction传入实例对象进行实例方法的引用
        Dog dog2 = new Dog();
        BiFunction<Dog, Integer, Integer> biFunction = Dog::eat;
        System.out.println("还剩下" + biFunction.apply(dog2, 2) + "斤");

        // 无参构造函数的方法引用，类似于静态方法引用，只需要分析好输入输出即可
        Supplier<Dog> supplier = Dog::new;
        System.out.println("创建了新对象：" + supplier.get());

        // 有参构造函数的方法引用
        Function<String, Dog> function2 = Dog::new;
        System.out.println("创建了新对象：" + function2.apply("旺财"));
    }
}

class Dog {
    private String name = "二哈";
    private int food = 10;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public static void bark(Dog dog) {
        System.out.println(dog + "叫了");
    }

    public int eat(int num) {
        System.out.println("吃了" + num + "斤");
        this.food -= num;
        return this.food;
    }

    public Dog eats(int num1,int num2,int num3,int num4,int num5) {
//        System.out.println("吃了" + num + "斤");
//        this.food -= num;
//        return this.food;
        return new Dog();
    }

    @Override
    public String toString() {
        return this.name;
    }
}
