package JavaSyntax;

public class l131WhatToDo {

    public static void whatToDo(){
        int time = 24;
        boolean isNight = time >= 23 || time <= 6;
        boolean isGoodWether = true;

        if (isNight) {
            System.out.println("Sleep");
        } if (isGoodWether && !isNight) {
            System.out.println("Go outside");
        } if (!isGoodWether && !isNight) {
            System.out.println("Read");
        }
    }
    public static void main(String[] args) {
        whatToDo();
    }
}
