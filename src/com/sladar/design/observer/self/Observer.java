package com.sladar.design.observer.self;
/**
 * @description 观察者（订阅者）
 * @author moyang
 * @email xiaojiju0811@163.com
 * @time 2020/1/15 0:18
 */
public interface Observer {
    /**
     * 更新通知
     * @param cur 当前更新数值，仅作为示例；
     */
    void update(int cur);
}
