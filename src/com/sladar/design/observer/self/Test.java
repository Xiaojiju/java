package com.sladar.design.observer.self;

public class Test {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        BlueBoardDisplay blueBoardDisplay = new BlueBoardDisplay(weatherData);
        PinkBoardDisplay pinkBoardDisplay = new PinkBoardDisplay(weatherData);
        weatherData.setCurrentNumber(1);
        weatherData.setCurrentNumber(2);
        weatherData.setCurrentNumber(3);
    }
}
