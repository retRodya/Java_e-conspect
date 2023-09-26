package Lesson25.Homework;

public class Main {
    public static void main(String[] args) {

        // Animal
            // Mechenosec
            Animal animalMechenosec = new Mechenosec("Animal Mechenosec");

            // Lion
            Animal animalLion = new Lion("Animal Lion");

            // Penguin
            Animal animalPenguin = new Penguin("Animal Penguin");


        // Bird
            // Penguin
            Bird birdPenguin = new Penguin("Bird Penguin");

        // Fish
            // Mechenosec
            Fish fishMechenosec = new Mechenosec("Fish Mechenosec");

        // Mammal
            // Lion (Mammal Lion can run, but Animal Lion - can't)
            Mammal mammalLion = new Lion("Mammal Lion");

        // Lion
            // Lion
            Lion lionLion = new Lion("Lion Lion");

        // Mechenosec
            // Mechenosec
            Mechenosec mechenosecMechenosec = new Mechenosec("Mechenosec Mechenosec");

        // Penguin
            // Penguin
            Penguin penguinPenguin = new Penguin("Penguin Penguin");



        // Speakable
            // Penguin
            Speakable speakablePenguin = new Penguin("Speakable Penguin");

            // Lion
            Speakable speakableLion = new Lion("Speakable Lion");


        // just space -------
        System.out.println();
        // just space -------


        // Speakable array
        Speakable [] sa = {speakableLion, speakablePenguin, lionLion, penguinPenguin};
        for (Speakable s:sa
             ) {
            if (s instanceof Speakable) {
                Speakable speakable = (Speakable) s;
                System.out.println(s + " instanceof Speakable");
                speakable.speak();
                System.out.println(); // space ------

            } else if (s instanceof Animal) {
                Animal animal = (Animal) s;
                System.out.println(s + " instanceof Animal");
                animal.eat();
                animal.sleep();
                System.out.println(); // space ------

            } else if (s instanceof Mammal) {
                Mammal mammal = (Mammal) s;
                System.out.println(s + " instanceof Mammal");
                mammal.run();
                mammal.eat();
                mammal.speak();
                mammal.sleep();
                System.out.println(); // space ------

            } else if (s instanceof Mechenosec) {
                Mechenosec mechenosec = (Mechenosec) s;
                System.out.println(s + " instanceof Mechenosec");
                mechenosec.eat();
                mechenosec.swim();
                mechenosec.sleep();
                System.out.println(); // space ------

            } else if (s instanceof Lion) {
                Lion lion = (Lion) s;
                System.out.println(s + " instanceof Lion");
                lion.eat();
                lion.sleep();
                lion.speak();
                lion.run();
                System.out.println(); // space ------

            } else if (s instanceof Fish) {
                Fish fish = (Fish) s;
                System.out.println(s + " instanceof Fish");
                fish.eat();
                fish.sleep();
                fish.swim();
                System.out.println(); // space ------

            } else if (s instanceof Bird) {
                Bird bird = (Bird) s;
                System.out.println(s + " instanceof Bird");
                bird.fly();
                bird.eat();
                bird.sleep();
                bird.speak();
                System.out.println(); // space ------

            } else if (s instanceof Penguin) {
                Penguin penguin = (Penguin) s;
                System.out.println(s + " instaceof Penguin");
                penguin.eat();
                penguin.speak();
                penguin.fly();
                System.out.println(); // space ------
            }
        }


        // just space -------
        System.out.println();
        // just space -------


        // Animal array
        Animal [] aa = {birdPenguin, mammalLion, animalLion, animalMechenosec, mechenosecMechenosec, (Animal)speakablePenguin};
        for (Animal a:aa
        ) {
            if (a instanceof Speakable) {
                Speakable speakable = (Speakable) a;
                System.out.println(a + " instanceof Speakable");
                speakable.speak();
                System.out.println(); // space ------

            } else if (a instanceof Animal) {
                Animal animal = (Animal) a;
                System.out.println(a + " instanceof Animal");
                animal.eat();
                animal.sleep();
                System.out.println(); // space ------

            } else if (a instanceof Mammal) {
                Mammal mammal = (Mammal) a;
                System.out.println(a + " instanceof Mammal");
                mammal.run();
                mammal.eat();
                mammal.speak();
                mammal.sleep();
                System.out.println(); // space ------

            } else if (a instanceof Mechenosec) {
                Mechenosec mechenosec = (Mechenosec) a;
                System.out.println(a + " instanceof Mechenosec");
                mechenosec.eat();
                mechenosec.swim();
                mechenosec.sleep();
                System.out.println(); // space ------

            } else if (a instanceof Lion) {
                Lion lion = (Lion) a;
                System.out.println(a + " instanceof Lion");
                lion.eat();
                lion.sleep();
                lion.speak();
                lion.run();
                System.out.println(); // space ------

            } else if (a instanceof Fish) {
                Fish fish = (Fish) a;
                System.out.println(a + " instanceof Fish");
                fish.eat();
                fish.sleep();
                fish.swim();
                System.out.println(); // space ------

            } else if (a instanceof Bird) {
                Bird bird = (Bird) a;
                System.out.println(a + " instanceof Bird");
                bird.fly();
                bird.eat();
                bird.sleep();
                bird.speak();
                System.out.println(); // space ------

            } else if (a instanceof Penguin) {
                Penguin penguin = (Penguin) a;
                System.out.println(a + " instaceof Penguin");
                penguin.eat();
                penguin.speak();
                penguin.fly();
                System.out.println(); // space ------
            }
        }
    }
}