package L04_03_StringBuilderBuffer;

import java.util.Scanner;

/*
 Write a program that converts a string containing a number to
 Roman format, to a number in Arabic format.
 Number limits: 1 to 3999. Provide for the case where the
 smaller character comes before the big one:
 For example CM == 900.
 Correspondence:
 * M 1000
 * D 500
 * C 100
 * L 50
 * X 10
 * V 5
 * I 1
 */
public class c4l4_RomeToArab {
     Scanner sc = new Scanner(System.in);
     String romeNumber = sc.nextLine();

    public static void main(String[] args) {
        System.out.println("Write your roman number:");
        c4l4_RomeToArab romeToArab = new c4l4_RomeToArab();
        System.out.println(romeToArab(romeToArab.romeNumber));
    }

    static int romeToArab (String romeNumber) {
        int prevArab = toArab(romeNumber.charAt(romeNumber.length() - 1));
        int result = prevArab;
        for (int i = romeNumber.length() - 2; i >= 0; i--) {
            int currentArabic = toArab(romeNumber.charAt(i));
            result += currentArabic < prevArab ? -currentArabic : currentArabic;
            prevArab = currentArabic;
        }
        return result;
    }

    static int toArab (char romanChar) {
        return switch (romanChar) {
            case 'M' -> 1000;
            case 'D' -> 500;
            case 'C' -> 100;
            case 'L' -> 50;
            case 'X' -> 10;
            case 'V' -> 5;
            case 'I' -> 1;
            default -> 0;
        };
    }
}
