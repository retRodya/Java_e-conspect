package JavaSyntax.l146;

public class Main {

    public static void main(String[] args) {
        Box box = new Box (10, 10, 10);
        BoxWeight boxWeight = new BoxWeight(15, 15, 15,15);

        box.showInfo();
        System.out.println();
        boxWeight.showInfo();
    }
}
