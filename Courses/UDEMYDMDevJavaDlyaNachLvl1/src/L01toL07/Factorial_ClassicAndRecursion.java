package L01toL07;

import java.util.Scanner;

public class Factorial_ClassicAndRecursion {
    static int number;

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Write your number: ");

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        Factorial_ClassicAndRecursion factorial = new Factorial_ClassicAndRecursion();
        System.out.println(factorial.factorial(number));

    }
//    int factorial (int number) { // x = x-1 * x-2 ...
//        if (number > 0) {
//            int result = 1;
//            for (int i = 1; i <= number; i++) {
//                result *= i;
//            }
//            return result;
//        } else if ( number == 0 ) {
//            return 0;
//        } else
//            System.out.println("Negative number");
//        return 0;
//    }

    int factorial (int number){
        if (number == 1 || number == 0) {
            return number;
        }
        number *= factorial(number - 1);
        return number;
    }
}
