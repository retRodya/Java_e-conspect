package L05_01_OOP_Encapsulation_and_Polymorphism;

public class c7l5_Runner2 {
    public static void main(String[] args) {
    i1l11_Printable laptop = new c5l5_Laptop(new c3l5_Ram(250), new c2l5_Ssd(1024), 2);
    i1l11_Printable mobile = new c6l5_Desktop(new c3l5_Ram(125), new c2l5_Ssd(512));

    print (laptop, mobile);
    }
    public static void print (i1l11_Printable... objects) {
        for (i1l11_Printable object : objects) {
            object.print();
            System.out.println();
        }
    }


}
