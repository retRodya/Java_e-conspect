package JavaSyntax.l150Exceptions;

import java.util.ArrayList;

public class Exception {

    public static void main(String[] args) {

        ArrayList <Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        try {
            System.out.println(arrayList.get(2));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Gotcha");
        } finally {
            System.out.println("Finally, some good fkn food");
        }
    }
}
