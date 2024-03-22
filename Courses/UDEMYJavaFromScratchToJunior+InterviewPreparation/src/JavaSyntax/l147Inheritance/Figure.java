package JavaSyntax.l147Inheritance;

public class Figure {
    protected double a;
    protected double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Figure(double a, double b) {
        this.a = a;
        this.b = b;
    }

    double getSquare(double a) {
        this.a = a;
        return a * a;
    }
    double getSquare(double a, double b) {
        this.a = a;
        this.b = b;
        return a * b;
    }
}
