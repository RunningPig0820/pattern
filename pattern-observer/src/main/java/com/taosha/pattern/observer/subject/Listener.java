package com.taosha.pattern.observer.subject;

import com.taosha.pattern.observer.observer.Observer;
/**
 * @ClassName Listener
 * @Description 监听者
 * @Author zhangMin
 * @Date 2018/12/14 11:34
 * @Version 1.0
 **/
public interface Listener {

    /**
     * 注册观察者
     * @param object
     */
    public void registerObserver(Observer object);

    /**
     * 删除观察者
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * 通知观察者
     * @param message 通知消息
     */
    public void notifyObserver(String message);
}
