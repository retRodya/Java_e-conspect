package L04_02_String;

/*
Divide sentence at equal parts. Save separate parts in array
 */

import java.util.Arrays;
import java.util.Scanner;

public class c5l1_SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Write your string:");
        String sentence = sc.nextLine();

        System.out.println("How many symbols in part?");
        int symbols = sc.nextInt();

        String [] result = partsInArray(sentence, symbols);
        System.out.println(Arrays.toString(result));

    }
    static String[] partsInArray (String sentence, int symbols) {
        int arraySize = (int) Math.ceil(sentence.length() / (double)symbols);
        String[] result = new String[arraySize];
        int index = 0;
        for (int i = 0; i < sentence.length(); i += symbols) {
            int endSymbols = Math.min(sentence.length(), i + symbols);
            String part = sentence.substring(i, endSymbols);
            result[index] = part;
            index++;
        }
        return result;
    }
}
