package JavaSyntax.l136;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.speed = 3;
        dog1.breed = "Poodel'";
        dog1.name = "Pogy";

        dog2.speed = 2;

        dog3.speed = 1;

        System.out.println(dog1.info());
        dog1.run();

        dog2.run();

        dog3.run();
    }
}
