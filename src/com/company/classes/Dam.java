package com.company.classes;

import com.company.interfaces.Observer;

import java.util.ArrayList;
import java.util.List;

public class Dam {
    private String name;
    private String city;
    private int earthquakeCounter;
    private List<Observer> observers = new ArrayList<>();

    public Dam(String name, String city) {
        this.name = name;
        this.city = city;
        this.earthquakeCounter = 0;
    }

    public void addDevice(Observer observer){
        observers.add(observer);
    }

    public void removeDevice(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers){
            observer.update(this);
        }
    }

    public void increaseEarthquakeCount(){
        earthquakeCounter++;
        notifyObservers();
    }

    public int getEarthquakeCounter() {
        return earthquakeCounter;
    }
}
