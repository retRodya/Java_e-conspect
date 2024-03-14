package JavaSyntax;

import java.util.Scanner;

public class l129ConditionalOperator {

    public static void buySuggestion() {
        System.out.println("Write your amount of money below:");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        if (value >= 500) {
            System.out.println("Order pizza");
        } else if (value >= 300) {
            System.out.println("Buy kebab");
        } else {
            System.out.println("RIP");
        }

    }
    public static void main(String[] args) {
        buySuggestion();
    }
}
