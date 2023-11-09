package L30_LambdaExpressions_2;

import java.util.ArrayList;
import java.util.List;

public class c3l3_SomeMethods {
    public static void main(String[] args) {
        List <String> helloList = List.of("Hello", "Hi", "Wats up", "Greetings");
//        for (String s:helloList) {
//            System.out.println(s);
//        }
        helloList.forEach (s -> System.out.println(s));

        /* or
           helloList.forEach (System.out::println);
         */

        ArrayList <Integer> iAl = new ArrayList<>();
        iAl.add(2);
        iAl.add(3);
        iAl.add(4);
        iAl.add(1);

        System.out.println(iAl);

        iAl.removeIf(element -> element % 3 == 0);
        System.out.println(iAl);

        iAl.sort((x,y) -> x.compareTo(y));
        // or
//        iAl.sort(Integer::compareTo);
        System.out.println(iAl);

        iAl.sort((x,y) -> -x.compareTo(y));
        System.out.println(iAl);
    }
}
