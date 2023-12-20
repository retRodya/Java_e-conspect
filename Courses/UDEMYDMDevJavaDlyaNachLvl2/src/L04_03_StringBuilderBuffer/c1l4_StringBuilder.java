package L04_03_StringBuilderBuffer;

public class c1l4_StringBuilder {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        StringBuilder value = new StringBuilder();
        for (int i = 0; i < 1000; i++) {
            value.append(i);
        }
        System.out.println("Time to calculate: " + (System.currentTimeMillis() - startTime));
    }
}
