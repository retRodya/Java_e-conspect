import java.util.*;

public class MYtestGenerics {
}

abstract class Animal {
    abstract String speak();
}

class Box<T> {
    List<T> slots = new ArrayList<>();

    List<T> getSlots() {
        return slots;
    }
}

class Dog extends Animal {
    @Override
    String speak() {
        return "meow";
    }
}

class Cat extends Animal {
    @Override
    String speak() {
        return "meow";
    }
}

class Main {
    public static void main(String[] args) {
        Box<Cat> catBox = new Box<>();
        Cat murzik = new Cat();

        catBox.getSlots().add(murzik);

        System.out.println(catBox.slots.get(0));

    }
}
