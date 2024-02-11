package L04_03_StringBuilderBuffer;

import java.util.Scanner;

/*
Is line palindrome?
 */
public class c2l4_Palindrome {
    Scanner sc = new Scanner(System.in);
    private final String line = sc.nextLine();

    public static void main(String[] args) {
        System.out.println("Write your line:");
        c2l4_Palindrome palindrome = new c2l4_Palindrome();
        boolean result = palindrome.isPalindrome(palindrome.line);
        System.out.println(result);
    }

    boolean isPalindrome(String line) {
        String space = " ";
        String empty = "";
        int fist = 0;

        String withoutSpaceLINE = line.replace(space, empty);

        for (int last = withoutSpaceLINE.length() - 1; last > fist; last--) {
            if (withoutSpaceLINE.charAt(fist) == withoutSpaceLINE.charAt(last)) {
                System.out.println(withoutSpaceLINE.charAt(fist) + " == " + withoutSpaceLINE.charAt(last));
                fist++;
            } else return false;
        }
        return true;
    }
}
