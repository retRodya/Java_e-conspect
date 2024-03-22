package JavaSyntax.l148Homework;

public class Programmer extends Employee implements Programmable{
    public Programmer(String name) {
        super(name);
    }

    @Override
    public void toProgram() {
        System.out.println("I can program pizdatij code");
    }
}
