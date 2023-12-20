package L05_01_OOP_Encapsulation;

public class c4l5_Runner {
    public static void main(String[] args) {
        c3l5_Ram ram = new c3l5_Ram(8196);
        c2l5_Ssd ssd = new c2l5_Ssd(500);

        c1l5_Computer computer = new c1l5_Computer(ram, ssd);
    }
}
