/**
 * Number given. Is last digit equal 3?
 */
public class LastNumberDigit_If {

    static int number;

    public static void main(String[] args) {
        number = 412353;
        if (number % 10 == 3) {
            System.out.println('y');
        } else System.out.println('n');
    }
}
