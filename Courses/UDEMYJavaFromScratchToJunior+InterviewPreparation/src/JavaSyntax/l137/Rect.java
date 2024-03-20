package JavaSyntax.l137;

public class Rect {
    int length;
    int width;

    void setLengthWidth(int length, int width) {
        this.length = length;
        this.width = width;
    }

    int perimeter() {
        return 2 * length + 2 * width;
    }

    int square() {
        return length * width;
    }
}
