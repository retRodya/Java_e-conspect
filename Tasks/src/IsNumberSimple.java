import java.util.Scanner;

public class IsNumberSimple {

    static int number;
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Write your number: ");

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        IsNumberSimple isNumberSimple = new IsNumberSimple();
        System.out.println(isNumberSimple.finder(number));

    }
    boolean finder (int number) {
        boolean result = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

}
