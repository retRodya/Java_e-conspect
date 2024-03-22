package JavaSyntax.l148Homework;

public class Cooker extends Employee implements Cookable{
    public Cooker (String name) {
        super(name);
    }

    @Override
    public void toCook() {
        System.out.println("I can cook tastiest cookies am-nyam-nyam");
    }
}