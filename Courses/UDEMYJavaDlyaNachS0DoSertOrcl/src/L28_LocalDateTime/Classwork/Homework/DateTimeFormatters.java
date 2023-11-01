package L28_LocalDateTime.Classwork.Homework;
import java.time.*;
import java.time.format.DateTimeFormatter;

// 1 Meke class
// 2 Make 2 DTF patterns
// 3 method takes 2 LDT, 1 Period, 1 Duration
// 4 While 1 LDT < 2 LDT do
//      a. sout("Work since: " + Date Time 1 LDT w/ dtf1)
//      b. 1 LDT + Period and sout(" Until: " + Date Time 1 LDT + Period  w/ dtf1)
//      c. sout("Rest since: " + Date Time 1 LDT + Period w/ dtf2)
//      d. 1 LDT + Duration and sout(" Until: " + Date Time 1 LDT + Period w/ dtf2)

// 1
public class DateTimeFormatters {

    // 2
    static DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy, MMMM-dd !!hh:mm");
    static DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm, dd/MMM/yy");

    static LocalDateTime ldt1 = LocalDateTime.of(2016, 1,1,9,0,0);
    static LocalDateTime ldt2 = LocalDateTime.of(2016, 2,3,9,0,0);

    static Period p = Period.ofDays(5);
    static Duration d = Duration.ofHours(48);

    // 3
    void rotate (LocalDateTime ldt1, LocalDateTime ldt2, Period p, Duration d) {
        // 4
        while (ldt1.isBefore(ldt2)) {
            System.out.println();
            System.out.println("Work since: " + ldt1.format(dtf1)); // a
            ldt1 = ldt1.plus(p); // b
            System.out.println(" Until " + ldt1.format(dtf1));
            System.out.println("Rest since: " + ldt1.format(dtf2)); // c
            ldt1 = ldt1.plus(d);
            System.out.println(" Until " + ldt1.format(dtf2)); // d

        }
    }

    public static void main(String[] args) {
        DateTimeFormatters dtf = new DateTimeFormatters();
        dtf.rotate(ldt1, ldt2, p, d);
    }
}

