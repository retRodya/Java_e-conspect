/**
 * Print only consonant letters
 */
public class Alphabet {
    public static void main(String[] args) {
        print();
    }

    private static void print() {
        for (char i = 'b'; i <= 'z' ; i++) {
            if (i == 'e' || i == 'i' || i == 'o' || i == 'u' || i == 'y') {
                continue;
            }
            System.out.println(i);
        }
    }
}
