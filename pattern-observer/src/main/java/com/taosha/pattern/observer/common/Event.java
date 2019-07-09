package com.taosha.pattern.observer.common;

import com.taosha.pattern.observer.observer.Observer;
import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Method;

/**
 * @ClassName Event
 * @Description 定义通知回调格式
 * @Author zhangMin
 * @Date 2018/12/14 11:59
 * @Version 1.0
 **/
@Data
@Builder
public class Event {
    /**
     * 事件源
     */
    private Object source;
    /**
     * 通知目标
     */
    private Object target;
    /**
     * 监听事件
     */
    private String message;
    /**
     * 事件时间
     */
    private long time;

}
