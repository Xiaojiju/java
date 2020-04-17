package com.sladar.design.observer.self;
/**
 * @description 蓝色板
 * @author moyang
 * @email xiaojiju0811@163.com
 * @time 2020/1/15 0:31
 */
public class BlueBoardDisplay implements Observer,Display {

    private int cur;
    private Subject subject;

    public BlueBoardDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("蓝色面板当前更新数字为" + cur);
    }

    @Override
    public void update(int cur) {
        this.cur = cur;
        display();
    }
}
