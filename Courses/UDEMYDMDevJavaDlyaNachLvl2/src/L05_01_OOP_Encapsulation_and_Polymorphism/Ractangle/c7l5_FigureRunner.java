package L05_01_OOP_Encapsulation_and_Polymorphism.Ractangle;

public class c7l5_FigureRunner {
    public static void main(String[] args) {
        c5l5_Point point1 = new c5l5_Point(2, 10);
        c5l5_Point point2 = new c5l5_Point(12, 4);

        System.out.println(point1.distance(point2));
        System.out.println(point2.distance(point1));

        c6l5_Rectangle rectangle = new c6l5_Rectangle(point1, point2);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getDiagonal());
    }
}
