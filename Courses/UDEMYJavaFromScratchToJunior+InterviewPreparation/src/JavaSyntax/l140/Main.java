package JavaSyntax.l140;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(10);

        Box box2 = box1.newBox(box1);

        System.out.println(box2);

        Box box3 = new Box(box1, box2);

        box1.showVolume();
        box2.showVolume();
        box3.showVolume();

        String [] array1 = {"Nick", "Anna"};
        String [] array2 = {"Nick", "Anna"};

        System.out.println(array1 == array2);
        System.out.println(array1.equals(array2));
        System.out.println(Arrays.equals(array1, array2));

        String test1 = new String("test1");
        Integer i1 = 2;
        Integer i2 = 2;

        System.out.println(test1);
        System.out.println(i1);

        System.out.println(i1 == i2);

    }
}
