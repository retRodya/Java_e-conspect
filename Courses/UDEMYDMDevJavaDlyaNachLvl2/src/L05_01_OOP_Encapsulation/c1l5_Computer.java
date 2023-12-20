package L05_01_OOP_Encapsulation;

public class c1l5_Computer {

    private c2l5_Ssd ssd;
    private c3l5_Ram ram;

    public c1l5_Computer(c3l5_Ram ram, c2l5_Ssd ssd) {
        this.ssd = ssd;
        this.ram = ram;
    }

    public void load() {
        System.out.println("PC loaded");
    }
}
