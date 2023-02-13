package com.example.patterns.facade;

public class Main {
    public static void main(String[] args) {
        EmployeeFacade facade = new EmployeeFacade();
        facade.startDay();
        facade.work();
        facade.goHome();
    }
}
