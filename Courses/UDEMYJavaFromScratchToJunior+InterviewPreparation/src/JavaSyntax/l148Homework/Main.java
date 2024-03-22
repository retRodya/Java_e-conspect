package JavaSyntax.l148Homework;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cooker cooker = new Cooker("Povar");
        Driver driver = new Driver("Rayan Gosling");
        Programmer programmer = new Programmer("Rodya");

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(cooker);
        employees.add(driver);
        employees.add(programmer);

        for (Employee employee : employees) {
            employee.voice();
        }

        ArrayList<Programmable> programmables = new ArrayList<>();
        programmables.add(programmer);
        for (Programmable programmable : programmables) {
            programmable.toProgram();
        }

        ArrayList<Cookable> cookables = new ArrayList<>();
        cookables.add(cooker);
        for (Cookable cookable : cookables) {
            cookable.toCook();
        }

        ArrayList<Driveable> driveables = new ArrayList<>();
        driveables.add(driver);
        for (Driveable driveable : driveables) {
            driveable.toDrive();
        }
    }
}
