package JavaSyntax.l148Homework;

public class Driver extends Employee implements Driveable {
    public Driver (String name) {
        super(name);
    }

    @Override
    public void toDrive() {
        System.out.println("I can perfectly drive a car");
    }
}