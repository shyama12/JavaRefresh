package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Main {
    public static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static String getDurationString (int minutes, int seconds) {
        if (minutes>=0 && seconds>=0 && seconds<=59){
            int hours = minutes/60;
            int remainingMinutes = minutes%60;
            DecimalFormat df = new DecimalFormat("00");
            return df.format(hours)+"h "+df.format(remainingMinutes)+"m "+df.format(seconds)+"s";
        }
        return INVALID_VALUE_MESSAGE;
    }

    public static String getDurationString (int seconds) {
        if (seconds>=0){
            int minutes = seconds/60;
            int remainingSeconds = seconds%60;
            System.out.println("Min = "+minutes);
            System.out.println("Rem Sec = "+remainingSeconds);
            return getDurationString(minutes, remainingSeconds);
        }
            return INVALID_VALUE_MESSAGE;
        }
    public static void main(String[] args) {
        System.out.println(getDurationString(3690));
    }
}
