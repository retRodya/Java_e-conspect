package L05_01_OOP_Encapsulation.Ractangle;

public class c5l5_Point {
    private int x;
    private int y;

    public c5l5_Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance (c5l5_Point point){
        double xPow = Math.pow(x - point.x, 2.0);
        double yPow = Math.pow(y - point.y, 2.0);
        return Math.sqrt(xPow + yPow);
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
