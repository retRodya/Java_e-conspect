package L28_LocalDateTime.Classwork;

import java.time.Duration;
import java.time.LocalTime;

// same as Period, but for days - nanos

public class c4l3_Duration {
    static Duration d1 = Duration.ofHours(1);
    static LocalTime lt1 = LocalTime.of(11,11);

    public static void main(String[] args) {
        System.out.println(lt1.plus(d1));
    }
}
