package L28_LocalDateTime.Classwork;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.FormatStyle;
import java.util.Stack;

public class c6l5_DateTimeFormatter {

    static LocalDateTime ldt1 = LocalDateTime.now();
    static DateTimeFormatter dtf1 = DateTimeFormatter.ISO_LOCAL_DATE;
    static DateTimeFormatter dtf2 = DateTimeFormatter.ISO_LOCAL_TIME;
    static DateTimeFormatter dtf3 = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

    static DateTimeFormatter shortFormat = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

    static DateTimeFormatter parseFormat = DateTimeFormatter.ofPattern("MM dd yyyy");
    static LocalDate ld2 = LocalDate.parse("11 11 2011", parseFormat);

    public static void main(String[] args) {
        System.out.println(ldt1);
        System.out.println(ldt1.format(dtf1));
        System.out.println(ldt1.format(dtf2));
        System.out.println(ldt1.format(dtf3));
        System.out.println(ldt1.format(shortFormat));
        System.out.println(shortFormat.format(ldt1));
        System.out.println(ld2);


    }
}
