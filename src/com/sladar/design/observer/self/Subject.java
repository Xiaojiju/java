package com.sladar.design.observer.self;
/**
 * @description 主题（出版方）
 * @author moyang
 * @email xiaojiju0811@163.com
 * @time 2020/1/15 0:16
 */
public interface Subject {
    /**
     * 订阅主题
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 退订主题
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知订阅者
     */
    void notifyObservers();
}
