package L30_LambdaExpressions_2;

// Local variable type inference

import java.util.ArrayList;

/**
class TestInferenceType == var
 */

public class c1l1_Var {

    public static void main(String[] args) {
        var tit = new TestInferenceType();

        var i = 10;

        var w = 1.5f;

        var array  = new String[]{"a", "b"};

        var result = abc();

        Object obj1 = "Hello";
        var obj2 = obj1; // but obj2 Object element type

        ArrayList <String> al = new ArrayList<>();
        for(var s:al) {
            System.out.println(s);
        }

        var array2 = new int [] {1,2};

        var var = "var";

        /** can't wtite:
         var h;
         var h; as class field
         var h; as method parameter
         var n = null;
         var array2 = {1,2};
         var [] array3 = new int[] {}; var not allowed as element type of an array
         var v(){return 3.14;} as return type
         */
    }

    static double abc() {
        return 3.14;
    }

}

class TestInferenceType {
}
