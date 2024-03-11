package ExampleOfInheritance;

public class ChildClass extends SuperClass {
    @Override
    void engine() {
        System.out.println("Engine start");;
    }

    public static void main(String[] args) {
        ChildClass childClass = new ChildClass();
        childClass.engine();
    }
}
