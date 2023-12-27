package L05_01_OOP_Encapsulation_and_Polymorphism;

public class c4l5_Runner {
    public static void main(String[] args) {
//        c3l5_Ram ram = new c3l5_Ram(8196);
//        c2l5_Ssd ssd = new c2l5_Ssd(500);
//
//        c1l5_Computer computer = new c1l5_Computer(ram, ssd);
        c1l5_Computer laptop = new c5l5_Laptop(new c3l5_Ram(250), new c2l5_Ssd(1024), 2);
        c1l5_Computer mobile = new c6l5_Desktop(new c3l5_Ram(125), new c2l5_Ssd(512));

        loadComputers(laptop, mobile);
        loadInformation(new c1l5_Computer[]{laptop, mobile});
    }
    public static void loadInformation (c1l5_Computer[] computers) {
        for (c1l5_Computer computer : computers) {
            computer.info();
            System.out.println();
        }
    }
    public static void loadComputers(c1l5_Computer... computers) {
        for (c1l5_Computer computer : computers) {
            computer.load();
            System.out.println();
        }
    }
}
