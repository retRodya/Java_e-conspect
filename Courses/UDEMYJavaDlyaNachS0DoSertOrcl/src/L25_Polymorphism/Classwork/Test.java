package L25_Polymorphism.Classwork;

public class Test {
    public static void main(String[] args) {
        Test test = new Test2();
        Test2 t22 = new Test2();
        Test2 t2 = (Test2)test;
        ((Test2)test).test2();
        System.out.println(test instanceof Test3);
    }
}
class Test2 extends Test implements Test3 {
    void test2 () {
        System.out.println("Test2");
    }
}

interface Test3{}

