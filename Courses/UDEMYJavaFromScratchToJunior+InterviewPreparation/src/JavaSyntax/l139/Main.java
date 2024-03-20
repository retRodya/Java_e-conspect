package JavaSyntax.l139;

public class Main {
    public static void main(String[] args) {
        Monstr monstr1 = new Monstr(1);
        Monstr monstr2 = new Monstr(2, 2);
        Monstr monstr3 = new Monstr(3, 3, 3);

        monstr1.voice();
        monstr2.voice(2);
        monstr3.voice(3, "rrrRRrRR!");
    }
}
