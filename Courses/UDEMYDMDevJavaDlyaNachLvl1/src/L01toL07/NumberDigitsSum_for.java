package L01toL07;

import java.util.Scanner;

/**
 * Find sum of digits of number.
 */
public class NumberDigitsSum_for {
    static int number;

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Write your number: ");

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        NumberDigitsSum_for numberDigitsSum = new NumberDigitsSum_for();
        System.out.println(numberDigitsSum.finder(number));
    }

    int finder (int number) {
        int sum = 0;
        for (int i = number; i > 0; i = i/10) {
            sum += i % 10;
        }
        return sum;
    }

}
