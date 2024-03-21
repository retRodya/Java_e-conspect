package JavaSyntax.l143MyArrayList;

public class Main {
    public static void main(String[] args) {
        MyArrayList names = new MyArrayList();

        names.add("Nick");
        names.add("Mick");
        names.add("Pick");

        names.remove(-1);
        System.out.println();

        for (int i = 0; i < names.getSize(); i++) {
            System.out.println(names.get(i));
        }
        System.out.println();
    }
}
