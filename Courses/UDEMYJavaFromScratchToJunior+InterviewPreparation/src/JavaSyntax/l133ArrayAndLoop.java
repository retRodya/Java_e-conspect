package JavaSyntax;

public class l133ArrayAndLoop {
    public static void main(String[] args) {
        int [] array1 = new int[10];
        System.out.println("============== array1 =============");
        for (int i = 0; i < array1.length; i++) {
            array1[i] = i + 100;
            System.out.println(i + " : " + array1[i]);
        }
        System.out.println();

        int [] array2 = new int [array1.length];
        System.out.println("============= array2 ===============");
        for (int i = 0, j = array1.length-1; i < array1.length ; i++, j--) {
            array2[i] = array1[j];
            System.out.println(i + " : " + array2[i]);

        }
    }
}
