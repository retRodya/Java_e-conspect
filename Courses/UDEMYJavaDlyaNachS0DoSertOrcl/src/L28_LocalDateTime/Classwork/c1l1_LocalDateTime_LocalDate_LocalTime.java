package L28_LocalDateTime.Classwork;

import java.time.*;

// c1l1 - class 1 lecture

public class c1l1_LocalDateTime_LocalDate_LocalTime {
    public static void main(String[] args) {

        // class LocalDateTime and method now()
        System.out.println();
        System.out.println("class LocalDateTime and method now()");
        System.out.println("YYY-DD-MMTime: " + LocalDateTime.now());
        System.out.println("YYY-DD-MM: " + LocalDate.now());
        System.out.println("Time: " + LocalTime.now());

        // can't create object LocalDate because LocalDate constructor - private
        // but can create by method (see CreateLocalDateObjectViaMethod class)

        // Method of()
        // LocalDate
        System.out.println();
        System.out.println("Method of()");
        LocalDate ld1 = LocalDate.of(2011,11,11); // Skyrim release day
        LocalDate ld2 = LocalDate.of(2011,Month.NOVEMBER,11); // same
        // LocalTime
        LocalTime lt1 = LocalTime.of(11,11);
        LocalTime lt2 = LocalTime.of(11,11,11);
        LocalTime lt3 = LocalTime.of(11,11,11,11);
        // LocalDateTime
        LocalDateTime ldt1 = LocalDateTime.of(11,11,11,11,11,11,11);
        LocalDateTime ldt2 = LocalDateTime.of(ld1, lt1);
        System.out.println(ldt2);

        // LocalDate methods
        System.out.println();
        System.out.println("LocalDate methods");
        ld2.minusYears(1); // - don't work, cause ld2 - immutable
        ld2 = ld2.plusDays(1);
        System.out.println(ld2);
        ld2 = ld2.minusDays(1);
        System.out.println(ld2);
        ld2 = ld2.plusWeeks(1);
        System.out.println(ld2);
        ld2 = ld2.minusWeeks(1);
        System.out.println(ld2);
        ld2 = ld2.plusMonths(1);
        System.out.println(ld2);
        ld2 = ld2.minusMonths(1);
        System.out.println(ld2);
        ld2 = ld2.plusYears(1);
        System.out.println(ld2);
        ld2 = ld2.minusYears(1);
        System.out.println(ld2);

        // LocalTime methods
        System.out.println();
        System.out.println("LocalTime methods");
        // method chaining
        lt3 = lt3.plusHours(1).minusHours(1).plusMinutes(1).minusMinutes(1).plusSeconds(1).minusSeconds(1).plusNanos(1).minusNanos(1);
        System.out.println(lt3);

        // LocalDateTime has all lt & ld methods

        // isAfter(), isBefore(), isEqual() methods
        System.out.println();
        System.out.println("isAfter(), isBefore(), isEqual() methods");
        System.out.println("ldt2 : ldt2");
        System.out.println("ifAfter() method " + ldt2.isAfter(ldt2));
        System.out.println("ifBefore() method: " + ldt2.isBefore(ldt2));
        System.out.println("ifEqual() method: " + ldt2.isEqual(ldt2));

    }
}
