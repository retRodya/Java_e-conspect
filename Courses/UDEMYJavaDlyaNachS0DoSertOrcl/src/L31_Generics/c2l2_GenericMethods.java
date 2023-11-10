package L31_Generics;

import java.util.ArrayList;

public class c2l2_GenericMethods {
    static <T> T get0Element (ArrayList <T> al) {
        return al.get(0);
    }

    public static void main(String[] args) {
        // Placeholder = Integer now
        ArrayList <Integer> alI = new ArrayList<>();
        alI.add(6);
        alI.add(2);
        alI.add(4);
        System.out.println(alI);

        int i = get0Element(alI);
        System.out.println(i);

        // Placeholder = String now
        ArrayList <String> alS = new ArrayList<>();
        alS.add("Hello");
        alS.add("2");
        alS.add("Hi");
        System.out.println(alS);

        String s = get0Element(alS);
        System.out.println(s);

    }
}
