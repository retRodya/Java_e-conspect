package JavaSyntax.l147Inheritance;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Rect rect = new Rect(5);
        Rect rect1 = new Rect(5, 10);

        Triangle triangle = new Triangle(10);
        Triangle triangle1 = new Triangle(2, 3, 4);

        System.out.println(rect.getSquare(rect.getA()));
        System.out.println(rect1.getSquare(rect1.getA(), rect1.getB()));

        System.out.println(triangle.getSquare(triangle.getA()));
        System.out.println(triangle1.getSquare(triangle1.getA(), triangle1.getB(), triangle1.getC()));

        ArrayList<To> figures = new ArrayList<>();
        figures.add(rect);
        figures.add(triangle);
        for (To figure : figures) {
            figure.to();
        }

        Rect rect2 = new Rect(1);
        To to = rect2;
        rect2 = (Rect) to;
    }
}
