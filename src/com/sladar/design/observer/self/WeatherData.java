package com.sladar.design.observer.self;

import java.util.ArrayList;
import java.util.List;
/**
 * @description 气象站
 * @author moyang
 * @email xiaojiju0811@163.com
 * @time 2020/1/15 11:44
 */
public class WeatherData implements Subject {

    private List<Observer> list;
    private int cur;

    public WeatherData() {
        list = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        list.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : list) {
            observer.update(cur);
        }
    }

    public void numberChanged() {
        notifyObservers();
    }

    public void setCurrentNumber(int cur) {
        this.cur = cur;
        numberChanged();
    }
}
