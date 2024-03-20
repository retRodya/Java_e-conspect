package JavaSyntax.l138;

public class Employee {
    String name;
    String rank;
    double salary;

    public Employee(String name, String rank, double salary) {
        this.name = name;
        this.rank = rank;
        this.salary = salary;
    }

    String salaryForMonths (int months, double a) {
        return name + ", " + rank + ", " + salary + " * " + months + " = " + months*salary;
    }
    String salaryForMonths (double a, int months) {
        return name + ", " + rank + ", " + salary + " * " + months + " = " + months*salary;
    }
}
