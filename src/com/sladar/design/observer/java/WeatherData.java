package com.sladar.design.observer.java;

import java.util.Observable;

public class WeatherData extends Observable {

    private int cur;

    public WeatherData() {
        super();
    }

    public void numberChanged() {
        setChanged();
        notifyObservers();
    }

    public void setCurrentNumber(int cur) {
        this.cur = cur;
        numberChanged();
    }

    public int getCur() {
        return cur;
    }
}
