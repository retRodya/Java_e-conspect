package L01toL07;

import java.util.Arrays;

/**
 * sum of digits between min and max
 */
public class DigitsSumInArray {

    //                     0  1  2
    static int[] array = {-1, 0, 13 , 2 , 5, -2, 0, 12};
    static int min = 0, max = 0, sum = 0, temp = 0;
    public static void main(String[] args) {
        finder();
        swapper();
        summer();
        printer();
    }

    private static void printer() {
        System.out.println("Sum of numbers between min index " + min + " and max index " + max + " in array " + Arrays.toString(array) + " is: " + sum);
    }

    private static void summer() {
        for (int i = min + 1; i < max; i++) {
            sum += array[i];
        }
    }

    private static void swapper() {
        if (min > max) {
            temp = min;
            min = max;
            max = temp;
        }
    }

    private static void finder() {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[min] && array[i] != array[min]) {
                min = i;
            } else if (array[i] > array[max] && array[i] != array[max]) {
                max = i;
            }
        }
    }
}
