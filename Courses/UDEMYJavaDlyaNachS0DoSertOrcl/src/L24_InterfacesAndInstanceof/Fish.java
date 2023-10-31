package L24_InterfacesAndInstanceof;

public abstract class Fish extends Animal {
    String name;
    Fish (String name) {
        super(name);
        this.name = name;
    }
    abstract void swim();

    void sleep() {
        System.out.println("Ona umeet spat??!");
    }
}

class Mechenosec extends Fish {
    Mechenosec(String name){
        super(name);
        this.name = name;
    }
    @Override
    void swim() {
        System.out.println("Swims with his mech");
    }

    @Override
    void eat() {
        System.out.println("Eats ribi korm");
    }
}
