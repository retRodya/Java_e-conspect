package L01toL07; /**
 * Amount of rubles given through console. Sout amount + word in correct case.
 */
import java.util.Scanner;
public class RubelWordInCorrectCase_If {
    static int rubles;

    public static void main(String[] args) {

        System.out.println();
        System.out.println("Write you amount below:");

        Scanner rublesScanner = new Scanner(System.in);
        rubles = rublesScanner.nextInt();
        correctCase();
    }
    static void correctCase () {
        if (rubles >= 2 && rubles <= 4) {
            System.out.println(rubles + " рубля");
        } else if (rubles == 1) {
            System.out.println(rubles + " рубль");
        } else {
            System.out.println(rubles + " рублей");
        }
    }
}