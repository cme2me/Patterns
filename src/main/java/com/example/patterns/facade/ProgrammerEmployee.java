package com.example.patterns.facade;

public class ProgrammerEmployee extends AbstractEmployee{

    @Override
    public void work() {
        System.out.println("Writing microservices");
    }

    @Override
    public String name() {
        return "Max";
    }
}
