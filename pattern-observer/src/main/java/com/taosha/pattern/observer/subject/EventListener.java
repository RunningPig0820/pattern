package com.taosha.pattern.observer.subject;

import com.taosha.pattern.observer.common.Event;
import com.taosha.pattern.observer.observer.Observer;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName EvenListener
 * @Description 事件接听者
 * @Author zhangMin
 * @Date 2018/12/14 14:55
 * @Version 1.0
 **/
public class EventListener implements Listener {

    private List<Observer> events = new ArrayList<Observer>();


    public void registerObserver(Observer object) {
        events.add(object);
    }

    public void removeObserver(Observer observer) {
        events.remove(observer);
    }

    public void notifyObserver(String message) {
        for (Observer observer : events) {
            Event event = Event.builder()
                    .source(this)
                    .target(observer)
                    .message(message)
                    .time(System.currentTimeMillis())
                    .build();
            observer.operation(event);
        }
    }
}
