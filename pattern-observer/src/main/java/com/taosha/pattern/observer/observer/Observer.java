package com.taosha.pattern.observer.observer;

import com.taosha.pattern.observer.common.Event;

/**
 * @ClassName Observer
 * @Description 观察者
 * @Author zhangMin
 * @Date 2018/12/14 11:37
 * @Version 1.0
 **/
public interface Observer {
    /**
     * 被观察的操作方法
     * @param event 操作打印日志
     */
    public void operation(Event event);
}
