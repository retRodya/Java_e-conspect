package L31_Generics;

public class c1l1_ParametrizedClass {
    public static void main(String[] args) {
        Info <String> info1 = new Info<>("Hello");
        System.out.println(info1);
        String s = info1.getValue();

        Info <Integer> info2 = new Info<>(5);
        System.out.println(info2);
        Integer i = info2.getValue();
    }
  /** Method overloading problem w/ generic syntax

   [For javac these methods look the same,
   cause generic syntax not visible for javac]

    public void abc(Info <String> info) {
        String s = info.getValue();
    }
    public void abc(Info <Integer> info) {
        Integer i = info.getValue();
    }
   */
}

class Info <T>{ // <T> - generic syntax - type placeholder
    private T value;

    public Info (T value) {
        this.value = value;
    }

    public String toString () {
        return "{[" + value + "]}";
    }

    T getValue() {
        return value;
    }
}

/** Overriding problem (same as overloading)

class Parent {
    public void abc(Info <String> info) {
        String s = info.getValue();
    }
}

class Child extends Parent {
    public void abc(Info <Integer> info) { // both methods have same erasure, yet either override the other
        Integer i = info.getValue();
    }
}
 */