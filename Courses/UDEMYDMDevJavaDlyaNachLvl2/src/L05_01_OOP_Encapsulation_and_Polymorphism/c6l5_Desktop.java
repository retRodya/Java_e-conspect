package L05_01_OOP_Encapsulation_and_Polymorphism;

public class c6l5_Desktop extends c1l5_Computer {

    public c6l5_Desktop(c3l5_Ram ram, c2l5_Ssd ssd) {
        super(ram, ssd);
    }

    @Override
    public void load() {
        System.out.println("Desktop loaded");
    }

    @Override
    public void info() {
        super.info();
    }
}
