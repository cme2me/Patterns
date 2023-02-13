package com.example.patterns.facade;

import java.util.List;

public class EmployeeFacade {
    private final List<AbstractEmployee> employeeList;

    public EmployeeFacade() {
        employeeList = List.of(new ProgrammerEmployee(), new HrEmployee());
    }

    public void startDay() {
        makeAction(employeeList, Actions.WAKE_UP);
    }

    public void work() {
        makeAction(employeeList, Actions.WORKING);
    }

    public void goHome() {
        makeAction(employeeList, Actions.GO_HOME);
    }

    private void makeAction(List<AbstractEmployee> employees, Actions actions) {
        employees.forEach(abstractEmployee -> abstractEmployee.action(actions));
    }
}
