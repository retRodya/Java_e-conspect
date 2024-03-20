package JavaSyntax.l140;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10);

        Box box2 = box1.newBox(box1);

        System.out.println(box2);

        Box box3 = new Box(box1, box2);

        box1.showVolume();
        box2.showVolume();
        box3.showVolume();
    }
}
