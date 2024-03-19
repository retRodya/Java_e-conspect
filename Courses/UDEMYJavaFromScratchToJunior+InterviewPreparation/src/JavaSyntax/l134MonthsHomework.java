package JavaSyntax;

import java.util.Scanner;

public class l134MonthsHomework {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter months short name below:");
        String monthNumber = sc.next();

        if (monthNumber.equals("Jan")) {
            System.out.println("Jan");
        } else if (monthNumber.equals("Feb")) {
            System.out.println("Feb");
        } else if (monthNumber.equals("Mar")) {
            System.out.println("Mar");
        } else if (monthNumber.equals("Apr")) {
            System.out.println("Apr");
        } else if (monthNumber.equals("May")) {
            System.out.println("May");
        } else if (monthNumber.equals("Jun")) {
            System.out.println("Jun");
        } else if (monthNumber.equals("Jul")) {
            System.out.println("Jul");
        } else if (monthNumber.equals("Aug")) {
            System.out.println("Aug");
        } else if (monthNumber.equals("Sep")) {
            System.out.println("Sep");
        } else if (monthNumber.equals("Oct")) {
            System.out.println("Oct");
        } else if (monthNumber.equals("Nov")) {
            System.out.println("Nov");
        } else if (monthNumber.equals("Dec")) {
            System.out.println("Dec");
        } else System.out.println("Month doesn't exist");

        switch (monthNumber) {
            case "Jan" -> System.out.println("Jan");
            case "Feb" -> System.out.println("Feb");
            case "Mar" -> System.out.println("Mar");
            case "Apr" -> System.out.println("Apr");
            case "May" -> System.out.println("May");
            case "Jun" -> System.out.println("Jun");
            case "Jul" -> System.out.println("Jul");
            case "Aug" -> System.out.println("Aug");
            case "Sep" -> System.out.println("Sep");
            case "Oct" -> System.out.println("Oct");
            case "Nov" -> System.out.println("Nov");
            case "Dec" -> System.out.println("Dec");
            default -> System.out.println("Month doesn't exist");
        }
    }

}
