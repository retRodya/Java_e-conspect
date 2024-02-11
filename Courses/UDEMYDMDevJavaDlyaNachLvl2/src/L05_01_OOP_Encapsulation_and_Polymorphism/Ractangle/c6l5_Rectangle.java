package L05_01_OOP_Encapsulation_and_Polymorphism.Ractangle;

public class c6l5_Rectangle {
    private c5l5_Point leftUpperCorner;
    private c5l5_Point rightLowerCorner;

    public c6l5_Rectangle(c5l5_Point leftUpperCorner, c5l5_Point rightLowerCorner) {
        this.leftUpperCorner = leftUpperCorner;
        this.rightLowerCorner = rightLowerCorner;
    }

    public double getDiagonal () {
        return leftUpperCorner.distance(rightLowerCorner);
    }

    public double getArea() {
        return (rightLowerCorner.getX() - leftUpperCorner.getX()) * (leftUpperCorner.getY() - rightLowerCorner.getY());
    }
}
