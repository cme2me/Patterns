package com.example.patterns.facade;

public class HrEmployee extends AbstractEmployee{
    @Override
    public void work() {
        System.out.println("Searching for a new employees");
    }

    @Override
    public String name() {
        return "Polly";
    }
}
