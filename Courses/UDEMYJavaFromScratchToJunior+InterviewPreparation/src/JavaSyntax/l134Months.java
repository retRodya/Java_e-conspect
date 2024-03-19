package JavaSyntax;

public class l134Months {
    static String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    static String[] months1 = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    static String test = "Hello";
    static String test1 = "Hello";
    public static void main(String[] args) {
        for (int i = 0; i < months.length; i++) {
            if (i != months.length-1) {
                System.out.print(months[i] + ", ");
            } else {
                System.out.println(months[i] + ".");
            }
        }
        System.out.println(months == months1);
        System.out.println(test == test1);
    }
}
