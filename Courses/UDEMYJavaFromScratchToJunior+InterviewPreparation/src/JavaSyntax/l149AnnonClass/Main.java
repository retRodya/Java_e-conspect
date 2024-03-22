package JavaSyntax.l149AnnonClass;

public class Main {
    public static void main(String[] args) {

        Director director = new Director();

        Counter counter = new Counter();

        director.force(counter, 6);
        director.force(new Counterable() {
            @Override
            public String toReport(int deadline) {
                return "Here is anon report for " + deadline + " months";
            }
        }, 6);
    }
}
