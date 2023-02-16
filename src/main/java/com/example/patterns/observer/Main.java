package com.example.patterns.observer;

public class Main {
    public static class Bike implements TrafficObserver{

        @Override
        public void update(TrafficType trafficType) {
            System.out.println("The situation for bikes is " + trafficType.getCurrentType());
        }
    }

    public static class Car implements TrafficObserver {

        @Override
        public void update(TrafficType trafficType) {
            System.out.println("The situation for cars is " + trafficType.getCurrentType());
        }
    }

    public static void main(String[] args) {
        var traffic = new Traffic();
        traffic.addObserver(new Bike());
        traffic.addObserver(new Car());
        traffic.timePasses();
        traffic.timePasses();
    }
}
