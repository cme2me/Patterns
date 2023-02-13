package com.example.patterns.facade;

import java.util.Arrays;

public abstract class AbstractEmployee {
    public abstract void work();

    public abstract String name();

    public void wakeUp() {
        System.out.println("Employee " + name() + " woke up");
    }

    public void working() {
        System.out.println(name() + " is working");
    }

    public void goHome() {
        System.out.println(name() + " goin home");
    }

    private void action(Actions action) {
        switch (action) {
            case WAKE_UP:
                wakeUp();
                break;
            case WORKING:
                working();
                break;
            case GO_HOME:
                goHome();
                break;
        }
    }

    public void action(Actions... actions) {
        Arrays.stream(actions).forEach(this::action);
    }
}
