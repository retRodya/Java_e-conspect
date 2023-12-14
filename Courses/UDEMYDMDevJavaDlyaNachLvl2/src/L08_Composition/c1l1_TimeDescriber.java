package L08_Composition;

/**
 * Create class,that describes a period of time.
 * The time period should be specified by three properties:
 * seconds, minutes, hours.
 * Create method to get total number of seconds in object.
 * Create two constructors: the first takes the total number
 * of seconds, the second - hours, minutes, and seconds
 * separately.
 * Create method to display data.
 */
public class c1l1_TimeDescriber {

    private int secondsPDT;
    private int minutesPDT;
    private int hoursPDT;
    private c2l1_Seconds seconds;
    private c3l1_Minutes minutes;
    private c4l1_Hours hours;

    public c1l1_TimeDescriber(int secondsTotal) {
        this.hoursPDT = secondsTotal / 3600;
        this.minutesPDT = secondsTotal % 3600 / 60;
        this.secondsPDT = secondsTotal % 3600 % 60;

    }

    public c1l1_TimeDescriber(c2l1_Seconds seconds, c3l1_Minutes minutes, c4l1_Hours hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public void printSeconds () {
        int secondsFull;
        secondsFull = hours.getValue() * 3600 + minutes.getValue() * 60 + seconds.getValue();
            System.out.println("Full time in seconds: " + secondsFull);
    }
    public void printTime () {
        System.out.println("Full time: " + hours.getValue() + ":" + minutes.getValue() + ":" + seconds.getValue());
    }
    public void printSecondsTotal () {
        System.out.println("Full time (from total seconds): " + hoursPDT + ":" + minutesPDT+ ":" + secondsPDT);
    }
}
