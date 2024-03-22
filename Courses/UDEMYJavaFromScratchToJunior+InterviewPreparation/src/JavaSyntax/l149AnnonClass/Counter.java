package JavaSyntax.l149AnnonClass;

public class Counter implements Counterable {
    @Override
    public String toReport(int deadline) {
        return "Here is report for " + deadline + " months";
    }
}
