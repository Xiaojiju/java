package com.sladar.design.observer.self;
/**
 * @description 根据订阅的消息更新来更新展示板，不同的展示板之间有不同样式
 * @author moyang
 * @email xiaojiju0811@163.com
 * @time 2020/1/15 0:23
 */
public interface Display {
    /**
     * 展示样式
     */
    void display();
}
