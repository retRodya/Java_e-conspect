package JavaSyntax.l145Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Collections {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(4);
        arrayList1.add(7);
        arrayList1.add(14);
        arrayList1.add(43);
        arrayList1.add(65);
        arrayList1.add(6);
        arrayList1.add(2);
        arrayList1.add(1);
        arrayList1.add(76);
        arrayList1.add(345);

        for (Integer i : arrayList1) {
            System.out.println(i);
        }
        System.out.println();

        ArrayList<String> arrayList2 = new ArrayList<>();
        arrayList2.add("Nick");
        arrayList2.add("Mick");
        arrayList2.add("Pick");
        arrayList2.add("Sick");
        arrayList2.add("Kick");
        arrayList2.add("Rick");
        arrayList2.add("Dick");
        arrayList2.add("Fick");
        arrayList2.add("Tick");
        arrayList2.add("Wick");

        for (String s : arrayList2) {
            System.out.println(s);
        }
        System.out.println();

        ArrayList <String> arrayList3 = new ArrayList<>();
        for (int i = 0; i < arrayList1.size(); i++) {
            arrayList3.add(arrayList1.get(i) + " - " + arrayList2.get(i));
        }

        for (String s : arrayList3) {
            System.out.println(s);
        }
        System.out.println();

    }
}
