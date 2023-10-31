package L28_LocalDateTime.Classwork;

import java.time.LocalDate;
import java.time.Month;

// c3t1 - class 3 lecture 1

// 15 pupil in form. Classroom changes very week.
// make list of attendants for 15 weeks.

public class c3t1_AttendantListTask {

    int pupils = 15;
    LocalDate ldFrom = LocalDate.of(2023, Month.SEPTEMBER, 1);
    LocalDate ldTo;

    void whoIsAttendant (int pupils) {
        int startFromPupil = 1;
        for (int i = startFromPupil; i <= pupils; i++) {
            ldTo = ldFrom.plusWeeks(1);
            System.out.println("Pupil № " +  i + " attendant from " + ldFrom + " to " + ldTo.minusDays(1));
            ldFrom = ldTo;
        }
    }

    public static void main(String[] args) {
        c3t1_AttendantListTask t3 = new c3t1_AttendantListTask();
        t3.whoIsAttendant(t3.pupils);
    }
}
