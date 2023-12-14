package L04_02_String;

/**
 * Replace all :( to :)
 */
public class c1l1_Replace {
    public static void main(String[] args) {
        String line = "asdaw :( awda :( :(:( :):) :)";
        String result = replace(line);
        System.out.println(result);
    }

    public static String replace(String line) {
        return line.replace(":(", ":)");
    }
}
