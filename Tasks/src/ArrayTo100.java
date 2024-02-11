/**
 * Put in array first 100 numbers which %13 and %17 == 0
 */
public class ArrayTo100 {
    static int[] array = new int[100];

    public static void main(String[] args) {
        setArray();
        getArray();
        StraightReverseArray_Foreach_Iter.reverse(array);
    }

    private static void setArray() {
//        int number = 0;
        for (int i = 1, number = 0; number < array.length; i++) {
            if (i % 13 == 0 || i % 17 == 0) {
                array[number++] = i;
//                System.out.println(number + ": " + array[number]);
//                number++;
            }
        }
    }

    static void getArray () {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}