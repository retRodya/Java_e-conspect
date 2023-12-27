package L05_01_OOP_Encapsulation_and_Polymorphism;

public final class c5l5_Laptop extends c1l5_Computer {

    private final int weight;

    public c5l5_Laptop(c3l5_Ram ram, c2l5_Ssd ssd, int weight) {
        super(ram, ssd);
        this.weight = weight;
    }

    @Override
    public void load() {
        System.out.println("Laptop loaded");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("Weight: " + weight);
    }

    public int getWeight() {
        return weight;
    }
}