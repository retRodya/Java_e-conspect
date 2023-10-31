package L28_LocalDateTime.Classwork;

import java.time.*;

// getDayOfWeek() methods and etc.

public class c5l4_getDayOfWeek {

    static LocalDate ld1 = LocalDate.now();
    static LocalDateTime ldt1 = LocalDateTime.now();

    public static void main(String[] args) {
        System.out.println(ld1.getDayOfWeek());
        System.out.println(ldt1.getDayOfMonth());
        System.out.println(ld1.getDayOfYear());
        System.out.println(ldt1.getMonth());
        System.out.println(ld1.getMonthValue());
        System.out.println(ldt1.getYear());

        System.out.println();
        System.out.println(ldt1.getNano());
        System.out.println(ldt1.getSecond());
        System.out.println(ldt1.getMinute());
        System.out.println(ldt1.getHour());
    }
}
