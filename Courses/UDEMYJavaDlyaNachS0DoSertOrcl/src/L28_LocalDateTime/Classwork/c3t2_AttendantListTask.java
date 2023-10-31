package L28_LocalDateTime.Classwork;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

// 15 pupil in form. Classroom changes very week.
// make list of attendants for 15 weeks.
// another way to solve this problem using Period class

public class c3t2_AttendantListTask {

    int pupils = 15;
    LocalDate ldFrom = LocalDate.of(2023, Month.SEPTEMBER, 1);
    LocalDate ldTo;
    Period p = Period.ofWeeks(1);

    void whoIsAttendant (int pupils, Period p) {
        int weekCounter = 1;
        int pupilNumber = 1;
        ldTo = ldFrom.plusYears(1);
        while (ldFrom.isBefore(ldTo)) {
            System.out.println("Pupil № " +  pupilNumber + " attendant today " + "(" + ldFrom + ")"
                    +" ["+ weekCounter + "]");
            ldFrom = ldFrom.plus(p);
            pupilNumber++;
            if (pupilNumber > 15) {
                pupilNumber = 1;
            }
            weekCounter++;
        }
    }

    public static void main(String[] args) {
        c3t2_AttendantListTask t3 = new c3t2_AttendantListTask();
        t3.whoIsAttendant(t3.pupils, t3.p);
    }
}
