package JavaSyntax.l147Inheritance;

public class Triangle extends Figure {

    protected double c;


    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    public Triangle(double a) {
        this(a,a,a);
    }
    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    double getSquare(double a) {
        return super.getSquare(a) * Math.sqrt(3) / 4;
    }

    double getSquare(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
