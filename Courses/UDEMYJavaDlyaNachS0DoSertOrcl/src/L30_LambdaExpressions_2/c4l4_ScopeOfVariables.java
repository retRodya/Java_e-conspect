package L30_LambdaExpressions_2;

import java.util.List;
import java.util.function.Predicate;

public class c4l4_ScopeOfVariables {
    public static void main(String[] args) {
        List<String> helloList = List.of("Hello", "Hi", "Wats up", "Greetings");
        String str = "String before cycle";
        for (String s : helloList) {
            Predicate <String> p = x -> { // can't x name s cause s already defined
                System.out.println(str.length());
                return x.length() > 4;
            };
        }
    }
}
