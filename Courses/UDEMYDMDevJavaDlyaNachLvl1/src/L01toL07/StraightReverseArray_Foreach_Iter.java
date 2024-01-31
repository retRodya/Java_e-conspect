package L01toL07;

/**
 * Print array in straight direction, then reverse.
 */
public class StraightReverseArray_Foreach_Iter {

//                        0  1  2  3  4
    static int[] array = {1, 2, 3, 4, 5};

    public static void main(String[] args) {
        straight();

        reverse(array);
    }

    public static void reverse(int[] array) {
        for (int i = array.length - 1; i >= 0 ; i--) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    private static void straight() {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
