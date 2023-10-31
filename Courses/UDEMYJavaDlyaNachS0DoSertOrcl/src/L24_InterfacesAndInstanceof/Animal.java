package L24_InterfacesAndInstanceof;

public abstract class Animal {
    protected String name;

    Animal(String name) {
        this.name = name;
    }
    abstract void eat();
    abstract void sleep();
}
