package JavaSyntax.l144Substring;

public class Main {
    public static void main(String[] args) {

        //Input string
        String string = "This is Igor. He is 34 years old. His height 175.5. His position is developer.";

        //Make substrings
        String name = string.substring(8, 12);
        String ageString = string.substring(20, 22);
        String heightString = string.substring(45, 50);
        String position = string.substring(68, 77);

        //Parse from strings
        int age = Integer.parseInt(ageString);
        double height = Double.parseDouble(heightString);

        //Create man
        Man man = new Man(name, position, age, height);

        //Output
        System.out.println(man.getPosition());
        System.out.println(man.getName());
        System.out.println(man.getHeight());
        System.out.println(man.getAge());
    }
}
