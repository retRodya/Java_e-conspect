package L04_03_StringBuilderBuffer;

import java.util.Scanner;

/*
Way 2.
 */
public class c3l4_Palindrome_Better {
    Scanner sc = new Scanner(System.in);
    private final String line = sc.nextLine();

    public static void main(String[] args) {
        System.out.println("Write your line:");
        c3l4_Palindrome_Better palindrome = new c3l4_Palindrome_Better();
        boolean result = palindrome.isPalindrome(palindrome.line);
        System.out.println(result);
    }

    boolean isPalindrome(String line) {
        String space = " ";
        String empty = "";
        String withoutSpaceLINE = line.replace(space, empty);
        return new StringBuilder(withoutSpaceLINE).reverse().toString().equalsIgnoreCase(withoutSpaceLINE);
    }
}
