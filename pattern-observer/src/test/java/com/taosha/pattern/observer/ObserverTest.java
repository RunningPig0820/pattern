package com.taosha.pattern.observer;

import com.taosha.pattern.observer.observer.Person;
import com.taosha.pattern.observer.subject.EventListener;
import com.taosha.pattern.observer.subject.Listener;
import com.taosha.pattern.observer.subject.Subject;
import org.junit.Test;

/**
 * @ClassName ObserverTest
 * @Description TODO
 * @Author zhangMin
 * @Date 2018/12/14 16:33
 * @Version 1.0
 **/
public class ObserverTest {

    @Test
    public void test_observer(){
        Person person = new Person("张三");
        Person person1 = new Person("李四");
        Person person2 = new Person("王五");

        Listener listener = new EventListener();
        listener.registerObserver(person);
        listener.registerObserver(person1);
        listener.registerObserver(person2);

        Subject subject = new Subject(listener);
        subject.sendMsg("官宣");

        //李四取消关注
        listener.removeObserver(person1);
        System.out.println("李四取消关注\n");


        subject.sendBlog("博客 - 观察者模式");
    }
}
