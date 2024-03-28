package com.designPatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject {
    List<Observer> observers = new ArrayList<>();
    private String weatherReport ;
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers)
            observer.update(weatherReport);
    }
    public void setWeatherReport(String weatherReport){
        this.weatherReport = weatherReport;
        notifyObservers();
    }
}
