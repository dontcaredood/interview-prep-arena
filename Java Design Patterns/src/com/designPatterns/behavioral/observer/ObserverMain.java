package com.designPatterns.behavioral.observer;

public class ObserverMain {
    public static void main(String[] args) {
        System.out.println("weather broadcast app");
        WeatherStation weatherStation = new WeatherStation();
        Observer observer1 = new Phone();
        Observer observer2 = new Phone();
        Observer observer3 = new TVDisplay();
        weatherStation.addObserver(observer1);
        weatherStation.addObserver(observer2);
        weatherStation.addObserver(observer3);
        weatherStation.setWeatherReport("VERY SUNNY");
    }
}
