package com.example.patterns.observer;

public enum TrafficType {
    LOW("LOW"), MEDIUM("MEDIUM"), HIGH("HIGH");

    String currentType;

    TrafficType(String currentType) {
        this.currentType = currentType;
    }

    public String getCurrentType() {
        return currentType;
    }
}
