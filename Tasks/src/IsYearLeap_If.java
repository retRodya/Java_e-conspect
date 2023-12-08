/**
 * Write year in console. Is this year leap?
 */
import java.util.Scanner;
public class IsYearLeap_If {
    static int year;
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Write your year below:");

        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();

        isYearLeap();
    }
    static void isYearLeap () {
        if (year % 4 == 0 && year % 100 != 0 || (year % 100 == 0 && year % 400 == 0)) {
            System.out.println(year + " year is leap");
        } else {
            System.out.println(year + " year is not leap");
        }
    }
}
