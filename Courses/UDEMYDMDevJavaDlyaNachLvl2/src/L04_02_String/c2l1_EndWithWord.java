package L04_02_String;

public class c2l1_EndWithWord {

    public static void main(String[] args) {
        boolean result = isStartEndWord("Dogs are good. I love Dogs.", "Dogs");
        System.out.println(result);
    }
    public static boolean isStartEndWord (String target, String word) {
        return target.startsWith(word) && target.endsWith(word+".");
    }
}
