package L05_14_OOP_Enum;

import java.util.Arrays;

public class c2l14_EnumRunner {
    public static void main(String[] args) {
        e1l14_ProcessorType processorType = e1l14_ProcessorType.BIT_32;
        System.out.println();

        System.out.println(processorType);
        System.out.println(processorType.name());
        System.out.println(processorType.getName());
        System.out.println(processorType.toString());
        System.out.println(e1l14_ProcessorType.valueOf("BIT_32"));
        System.out.println(Arrays.toString(e1l14_ProcessorType.values()));
        System.out.println(e1l14_ProcessorType.BIT_32.ordinal());
        System.out.println(e1l14_ProcessorType.BIT_64.getName());
        System.out.println(e1l14_ProcessorType.BIT_64.getClass());
        System.out.println(e1l14_ProcessorType.BIT_64.getDeclaringClass());
        System.out.println();

        System.out.println(processorType.getDescription());
        System.out.println(e1l14_ProcessorType.BIT_64.getDescription());
        System.out.println();
    }
}
