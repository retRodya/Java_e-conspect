package L24_InterfacesAndInstanceof;

public abstract class Mammal extends Animal implements Speakable {

    Mammal(String name) {
        super(name);
        this.name = name;
    }

    abstract void run();
}

class Lion extends Mammal {

    Lion(String name) {
        super(name);
        this.name = name;
    }

    void eat() {
        System.out.println("Myasoooo");
    }

    void sleep() {
        System.out.println("Sleeps. Typical kot");
    }

    void run() {
        System.out.println("I'm fast af boy");
    }
}

interface Speakable {
    default void speak() {
        System.out.println("Somebody speaks");
    }
}
