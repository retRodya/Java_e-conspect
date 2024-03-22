package JavaSyntax.l148Homework;

public abstract class Employee {

    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void voice () {
        System.out.println("My name is " + getName());
    }
}
