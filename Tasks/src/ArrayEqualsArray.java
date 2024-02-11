/**
 * Does [][] equals to [][]?
 */
public class ArrayEqualsArray {
    static int[][] array1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
    static int[][] array2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

    public static void main(String[] args) {
        System.out.println(arraysEquals(array1, array2));
    }

    private static boolean arraysEquals(int[][] array1, int[][] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
//            int[] line1 = array1[i];
//            int[] line2 = array2[i];
//            if (line1.length != line2.length) {
//                return false;
//            }
            for (int j = 0; j < array1.length; j++) {
//                if (line1[j] != line2[j]) {
//                    return false;
//                }
                if (array1[i][j] != array2[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}