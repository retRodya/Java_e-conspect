package L04_02_String;

import java.util.Scanner;

/*
Count number of . , !
 */
public class c4l1_Counter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write your sentence: ");
        String sentence = scanner.nextLine();

        int result = counter(sentence);

        counterCorrector(result);

        System.out.println("Another method(counter2) to find out quantity: " + counter2(sentence));

    }

    static int counter(String sentence) {
        int counter = 0;
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == '.' || sentence.charAt(i) == ',' || sentence.charAt(i) == '!') {
                counter++;
            }
        }
        return counter;
    }
    static void counterCorrector (int result) {
        if (result > 1 || result == 0) {
            System.out.println("Your sentence have " + result + " signs");
        } else System.out.println("Your sentence have " + result + " sign");
    }
    static int counter2 (String sentence) {
        String sentence2 = sentence.replace(",", "").replace(".", "").replace("!", "");

        return sentence.length() - sentence2.length();
    }
}