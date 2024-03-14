package JavaSyntax;

import java.util.Scanner;

public class l128Variables {

    public static void secondsIntoDaysHoursMinutesSeconds (){
        System.out.println("Enter amount of seconds below:");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        int minutes = value/60;
        int hours = minutes/60;
        int days = hours/24;


        System.out.println(value + " seconds are:");
        System.out.println("in Days: " + days);
        System.out.println("in hours: " + hours);
        System.out.println("in minutes: " + minutes );
        System.out.println("in seconds: " + value);
    }


    public static void DaysHoursMinutesSecondsInSeconds(){

        System.out.println();
        System.out.println("Enter amount of seconds below:");
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        /*
        seconds in:
        minutes = 60
        hours = 3600
        days = 86400
         */
        int days = value / 86400;
        int hours = value % 86400 / 3600;
        int minutes = value % 86400 % 3600 / 60;
        int seconds = value % 86400 % 3600 % 60;

        System.out.println(value + " seconds are:");
        System.out.println("Days: " + days);
        System.out.println("hours: " + hours);
        System.out.println("minutes: " + minutes );
        System.out.println("seconds: " + seconds);
    }

    public static void main(String[] args) {

        secondsIntoDaysHoursMinutesSeconds();

        DaysHoursMinutesSecondsInSeconds();
    }
}
