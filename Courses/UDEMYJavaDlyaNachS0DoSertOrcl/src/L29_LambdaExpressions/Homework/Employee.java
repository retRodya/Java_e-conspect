package L29_LambdaExpressions.Homework;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}

class TestEmployee {
    void printEmployee (Employee e) {
        System.out.println(e.name + " from " + e.department + " department. " + "Salary: " + e.salary);
    }

    void filterEmployee (ArrayList <Employee> eal, Predicate <Employee> t) {
        for (Employee e : eal) {
//            System.out.println("---------------");
            if (t.test(e)) {
                System.out.println("===============");
//                System.out.println("Need to increase salary of " + e.name + " from " + e.department + " department ");
                printEmployee(e);
            }
        }
    }

    public static void main(String[] args) {

        // Employee list
        Employee eJ = new Employee("Jack", "Surgery", 1000.00);
        Employee eN = new Employee("Nicole", "General practice", 800.00);
        Employee eM = new Employee("Mike", "Service", 500);
        Employee eA = new Employee("Alex", "IT", 2000);
        Employee eE = new Employee("Elly", "Model", 500);
        Employee eS = new Employee("Sergei", "Sergei", 1500);

        // add them to AL
        ArrayList <Employee> eal = new ArrayList<>();
        eal.add(eJ);
        eal.add(eN);
        eal.add(eM);
        eal.add(eA);
        eal.add(eE);
        eal.add(eS);

        //class method object of interest
        TestEmployee te = new TestEmployee();

        // my conditions
//        te.filterEmployee(eal, t -> t.salary <= 500);

        // conditions from home task
        te.filterEmployee(eal, t -> t.salary > 200 && t.department == "IT");
        te.filterEmployee(eal, t -> t.name.startsWith("E") && t.salary != 450);
        te.filterEmployee(eal, t -> t.name == t.department );
    }
}
