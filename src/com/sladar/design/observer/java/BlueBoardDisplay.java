package com.sladar.design.observer.java;

import com.sladar.design.observer.self.Display;

import java.util.Observable;
import java.util.Observer;

public class BlueBoardDisplay implements Observer, Display {

    private int cur;
    private Observable observable;

    public BlueBoardDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("蓝色面板当前的数字是" + cur);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.cur = weatherData.getCur();
            display();
        }
    }
}
