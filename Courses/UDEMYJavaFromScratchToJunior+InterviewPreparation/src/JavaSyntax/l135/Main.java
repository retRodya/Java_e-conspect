package JavaSyntax.l135;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.age = 41;
        person1.name = "Papa";
        person1.weight = 62.4;
        Person person2 = new Person();
        person2.weight = 50.0;
        person2.name = "Mama";
        person2.age = 40;
        Person person3 = new Person();
        person3.weight = 58.0;
        person3.name = "Sina";
        person3.age = 16;
        Person person4 = new Person();
        person4.weight = 42.0;
        person4.name = "Docha";
        person4.age = 11;
        Person person5 = new Person();
        person5.weight = 10.0;
        person5.name = "Mladshij";
        person5.age = 1;

        int averageAge = (person1.age + person2.age + person3.age + person4.age + person5.age) / 5;

        System.out.println("Average family age = " + averageAge);
    }

}
