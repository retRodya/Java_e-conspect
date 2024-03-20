package JavaSyntax.l136;

public class Dog {
    String name;
    String breed;
    int speed;

    void run() {
        for (int i = 1; i <= speed; i++) {
            if (i == 1 && i == speed) {
                System.out.println("Run!");
            } else if (i == 1 && i != speed) {
                System.out.print("Run, ");
            } else if (i != 1 && i != speed) {
                System.out.print("run, ");
            } else if (i != 1 && i == speed) {
                System.out.println("run!");
            }
        }
    }

    String info(){
        return name + ", " + breed + ", " + speed;
    }
}
