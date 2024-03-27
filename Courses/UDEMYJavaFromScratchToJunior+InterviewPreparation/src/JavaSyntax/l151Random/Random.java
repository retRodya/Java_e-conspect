package JavaSyntax.l151Random;

public class Random {
    public static void main(String[] args) {
        int randomInt = (int) (Math.random() * 100 + 1);

        String randomString = String.format("Random result is %s. Try again.", randomInt);

        System.out.println(randomString);

        Thread thread = new Thread();
        thread.start();
    }
}
