package JavaSyntax;

import java.util.Scanner;

public class l134MonthsHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter months short name below:");
        String monthNumber = sc.next();

        if (monthNumber.equals("Jan") || monthNumber.equals("Feb") || monthNumber.equals("Dec")) {
            System.out.println("Winter");
        } else if (monthNumber.equals("Mar") || monthNumber.equals("Apr") || monthNumber.equals("May")) {
            System.out.println("Spring");
        } else if (monthNumber.equals("Jun") || monthNumber.equals("Jul") ||monthNumber.equals("Aug") ) {
            System.out.println("Summer");
        } else if (monthNumber.equals("Sep") || monthNumber.equals("Oct") || monthNumber.equals("Nov")) {
            System.out.println("Autumn");
        } else System.out.println("Season doesn't exist");

        switch (monthNumber) {
            case "Jan", "Feb", "Dec" -> System.out.println("Winter");
            case "Mar", "Apr", "May" -> System.out.println("Spring");
            case "Jun", "Jul", "Aug" -> System.out.println("Summer");
            case "Sep", "Oct", "Nov" -> System.out.println("Autumn");
            default -> System.out.println("Season doesn't exist");
        }
    }
}
