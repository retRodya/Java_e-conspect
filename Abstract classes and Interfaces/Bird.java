package Lesson24.Homework;

public abstract class Bird extends Animal implements Speakable {
    Bird (String name) {
        super(name);
        this.name = name;
    }

    abstract void fly();

    @Override
    public void speak() {
        System.out.println(name + "sings");
    }
}

class Penguin extends Bird {

    Penguin (String name) {
        super(name);
        this.name = name;
    }
    void eat() {
        System.out.println("Penguin eats ribku!");
    }
    void sleep() {
        System.out.println("Penguin naelsya i spit");
    }
    void fly() {
        System.out.println("Penguin ne letaet :((9(");
    }
    public void speak() {
        System.out.println("'govorit po penguinsky'");
    }
}
