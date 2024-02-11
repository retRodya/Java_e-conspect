package L05_01_OOP_Encapsulation_and_Polymorphism;

public abstract class c1l5_Computer implements i1l11_Printable {

    private c2l5_Ssd ssd;
    private c3l5_Ram ram;

    public c1l5_Computer(c3l5_Ram ram, c2l5_Ssd ssd) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public abstract void load();
    public void info() {
        System.out.println("Ram: " + ram.getValue() + " Ssd: " + ssd.getValue());
    }

    @Override
    public void print() {
        System.out.println("Ram: " + ram.getValue() + " Ssd: " + ssd.getValue());
    }
}
