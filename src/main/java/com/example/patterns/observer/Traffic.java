package com.example.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Traffic {
    private TrafficType currentSituation;
    private final List<TrafficObserver> observers;

    public Traffic() {
        this.currentSituation = TrafficType.HIGH;
        this.observers = new ArrayList<>();
    }

    public void addObserver(TrafficObserver obs) {
        observers.add(obs);
    }

    public void removeObserver(TrafficObserver obs) {
        observers.remove(obs);
    }

    public void timePasses() {
        var enumValues = TrafficType.values();
        currentSituation = enumValues[(currentSituation.ordinal() + 1) % enumValues.length];
        System.out.println("The situation changed to {}" + currentSituation.getCurrentType());
        notifyObservers();
    }

    private void notifyObservers() {
        for (var obs : observers) {
            obs.update(currentSituation);
        }
    }
}
