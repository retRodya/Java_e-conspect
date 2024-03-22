package JavaSyntax.l146;

public class BoxWeight extends Box {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public BoxWeight(double width, double height, double length, int weight) {
        super(width, height, length);
        this.weight = weight;
    }

    public BoxWeight(double size, int weight) {
        super(size);
        this.weight = weight;
    }

    public BoxWeight(int weight) {
        this.weight = weight;
    }

    public BoxWeight(Box box, int weight) {
        super(box);
        this.weight = weight;
    }

    public BoxWeight(Box box1, Box box2, int weight) {
        super(box1, box2);
        this.weight = weight;
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println(", weight: " + weight);
    }
}
