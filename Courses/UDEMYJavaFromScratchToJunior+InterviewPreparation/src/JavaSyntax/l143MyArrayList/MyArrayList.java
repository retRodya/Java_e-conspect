package JavaSyntax.l143MyArrayList;

public class MyArrayList {
    //    private String[] array = new String[10];
//    private int size = 0;
//
//    public int getSize() {
//        return size;
//    }
//
//    public void add(String element) {
//        array[size] = element;
//        size++;
//        if (size == array.length) {
//            String[] newArray = new String[array.length * 2];
//            for (int i = 0; i < array.length; i++) {
//                newArray[i] = array[i];
//            }
//            array = newArray;
//        }
//    }
//    // {1, 2, 3}  length = 3
//    // [0  1  2]
//    // {1, 2}
//
//    // {1, 2, 3}  length = 3
//    // [0, 1, 2]
//    // {1, 3}
//    public void remove(int index) {
//        if (index >= 0 && index <= size) {
//            for (int i = index; i < size; i++) {
//                array[i] = array[i + 1];
//            }
//            size--;
//        }
//    }
//
//    public void remove(String s) {
//        int index = -1;
//        for (int i = 0; i < size; i++) {
//            if (s.equals(array[i])) {
//                index = i;
//                break;
//            }
//        }
//        if (index != -1) {
//            remove(index);
//        } else {
//            System.out.println("Wrong sting");
//        }
//    }
//
//    public String get(int index) {
//        if (index >= 0 && index <= size) {
//            return array[index];
//        }
//        return "Element not found";
//    }
//}
    private String[] array = new String[10];
    private int size = 0;

    public int getSize() {
        return size;
    }

    public void add(String s) {
        array[size] = s;
        size++;
        if (size == array.length) {
            String[] newArray = new String[array.length * 2];
            for (int i = 0; i < array.length; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    public void remove(int index) {
        if (correct(index)) {
            for (int i = index; i < size; i++) {
                array[index] = array[index + 1];
            }
            size--;
        } else {
            System.out.println("Wrong index");
        }
    }

    public void remove(String s) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (s.equals(array[i])) {
                index = i;
                break;
            }
        }
        if (index != -1){
            remove(index);
        } else {
            System.out.println("Wrong string");
        }
    }

    public String get(int index) {
        if (correct(index)) {
            return array[index];
        } else {
            return "Wrong index";
        }
    }

    public boolean correct(int index) {
        return index >= 0 && index <= size;
    }



}
