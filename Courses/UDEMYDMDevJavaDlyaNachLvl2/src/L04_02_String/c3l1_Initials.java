package L04_02_String;

/*
  Write full name. Return initials.
 */

import java.util.Scanner;

public class c3l1_Initials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Write your last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Write your patronymic: ");
        String patronymic = scanner.nextLine();

        String fio = fio(firstName, lastName, patronymic);

        System.out.println("Your full name initials are: " + fio);
    }
    static String fio (String fistName, String lastName, String patronymic) {
//        char fistNameChar = fistName.toUpperCase().charAt(0);
//        char lastNameChar = lastName.toUpperCase().charAt(0);
//        char patronymicChar = patronymic.toUpperCase().charAt(0);

        char fistNameChar = Character.toUpperCase(fistName.charAt(0));
        char lastNameChar = Character.toUpperCase(lastName.charAt(0));
        char patronymicChar = Character.toUpperCase(patronymic.charAt(0));



//        return lastNameChar + "." + fistNameChar + "." + patronymicChar + ".";
        return String.format("%s.%s.%s", lastNameChar, fistNameChar, patronymicChar);
    }
}
