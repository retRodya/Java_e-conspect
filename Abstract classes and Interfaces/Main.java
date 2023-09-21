package Lesson24.Homework;

public class Main {
    public static void main(String[] args) {

        // mechenosec
        Mechenosec mechenosec = new Mechenosec("Mechko");
        System.out.println();
        System.out.println("mechenosec " + mechenosec.name);
        mechenosec.swim();
        mechenosec.eat();
        mechenosec.sleep();

        // speakable Penguin
        Speakable speakablPenguin = new Penguin("Pigi");
        System.out.println();
        System.out.println("speakablPenguin with no name, cause speakablePenguin - is speakable - interface data type");
        speakablPenguin.speak();

        // animal Lion
        Animal animalLion = new Lion("Lowe");
        System.out.println();
        System.out.println("animalLion " + animalLion.name);
        animalLion.eat();
        animalLion.sleep();

        // Mammal lion can run, but animal Lion - can't
        Mammal mammalLion = new Lion("Lowe");
        System.out.println();
        System.out.println("mammalLion " + mammalLion.name);
        mammalLion.run();
    }
}
