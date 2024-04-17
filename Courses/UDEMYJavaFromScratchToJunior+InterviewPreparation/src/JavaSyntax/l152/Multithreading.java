package JavaSyntax.l152;

import JavaSyntax.l151Random.Random;

public class Multithreading {

    static boolean win = false;

    public static void main(String[] args) {
        int randomInt = (int) (Math.random() * 100000000);
        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    int i = 1;
                    while (!win) {
                        System.out.println(i);
                        i++;
                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {
                    System.out.println("random int guessed");
                }
            }
        });
        Thread guessRandomInt = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!win) {
                    int guesser = (int) (Math.random() * 100000000);
                    if (guesser == randomInt) {
                        System.out.println(guesser);
                        win = true;
                    }
                }
            }
        });
        System.out.println(randomInt);
        timer.start();
        guessRandomInt.start();
    }
}
