public class Q30_NullPointerException {
    /**
     * Occurs when trying to access method or field
     * of a null object. To prevent this,
     * ensure that objects reference not null
     */
        public static void main(String[] args) {
            String name = "null";
            if (name != null) {
                int length = name.length();
                System.out.println(length);
            }
        }
}
