package L08_Composition;

public class c5l1_CompositionRunner {
    public static void main(String[] args) {
        c2l1_Seconds seconds = new c2l1_Seconds(24);
        c3l1_Minutes minutes = new c3l1_Minutes(24);
        c4l1_Hours hours = new c4l1_Hours(24);

        c1l1_TimeDescriber timeDescriber = new c1l1_TimeDescriber(seconds,minutes,hours);
        c1l1_TimeDescriber timeDescriberTotal = new c1l1_TimeDescriber(87860);

        timeDescriber.printTime();
        System.out.println();
        timeDescriber.printSeconds();
        System.out.println();
        timeDescriberTotal.printSecondsTotal();
    }
}
