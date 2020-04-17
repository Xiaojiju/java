package com.sladar.design.observer.java;

public class Test {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        PinkBoardDisplay pinkBoardDisplay = new PinkBoardDisplay(weatherData);
        BlueBoardDisplay blueBoardDisplay = new BlueBoardDisplay(weatherData);
        weatherData.setCurrentNumber(1);
        weatherData.setCurrentNumber(2);
    }

}
