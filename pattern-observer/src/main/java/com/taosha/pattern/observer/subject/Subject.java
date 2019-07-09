package com.taosha.pattern.observer.subject;

/**
 * @ClassName Subject
 * @Description TODO
 * @Author zhangMin
 * @Date 2018/12/14 16:19
 * @Version 1.0
 **/
public class Subject  {

    Listener listener;

    public Subject(Listener listener) {
        this.listener = listener;
    }

    public void sendMsg(String msg){
        System.out.println(msg);
        listener.notifyObserver(msg);
    }

    public void sendBlog(String blog){
        System.out.println(blog);
        listener.notifyObserver(blog);
    }
}
