package com.sladar.design.observer.self;

import java.util.Observable;

public class PinkBoardDisplay implements Display,Observer {
    private int cur;
    private Subject subject;

    public PinkBoardDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("粉红色面板更新数字为" + cur);
    }

    @Override
    public void update(int cur) {
        this.cur = cur;
        display();
    }
}
