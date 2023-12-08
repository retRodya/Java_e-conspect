import java.util.Scanner;

/**
 * Which year of animal?
 */

public class AnimalYear_Switch {
    static int year;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.print("Write year: ");

        year = scanner.nextInt();

        animalYear();
    }
    static void animalYear () {
        switch (year % 12) {
            case 0 -> System.out.println(year + " year of monkey");
            case 1 -> System.out.println(year + " year of rooster");
            case 2 -> System.out.println(year + " year of dog");
            case 3 -> System.out.println(year + " year of pig");
            case 4 -> System.out.println(year + " year of rat");
            case 5 -> System.out.println(year + " year of bull");
            case 6 -> System.out.println(year + " year of tiger");
            case 7 -> System.out.println(year + " year of rabbit");
            case 8 -> System.out.println(year + " year of dragon");
            case 9 -> System.out.println(year + " year of snake");
            case 10 -> System.out.println(year + " year of horse");
            case 11 -> System.out.println(year + " year of sheep");
            default -> System.out.println(year + " invalid year");
        }
    }

}
