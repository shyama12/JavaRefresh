package com.company;

public class Main {

    public static void main(String[] args) {

        int maxIntValue = Integer.MAX_VALUE;
        int minIntValue = Integer.MIN_VALUE;
        System.out.println("Maximum value for int = " + maxIntValue);
        System.out.println("Minimum value for int = " + minIntValue);

        System.out.println("Busted max value for int = " + (maxIntValue + 1));
        System.out.println("Busted min value for int = " + (minIntValue - 1));

        //byte
        byte minValueByte = Byte.MIN_VALUE;
        byte maxValueByte = Byte.MAX_VALUE;
        System.out.println("Minimum value for byte = "+ minValueByte);
        System.out.println("Maximum value for byte = "+ maxValueByte);

        //short
        short minValueShort = Short.MIN_VALUE;
        short maxValueShort = Short.MAX_VALUE;
        System.out.println("Minimum value for short = "+ minValueShort);
        System.out.println("Maximum value for short = "+ maxValueShort);

        //long
        long minValueLong = Long.MIN_VALUE;
        long maxValueLong = Long.MAX_VALUE;
        System.out.println("Minimum value for long = "+ minValueLong);
        System.out.println("Maximum value for long = "+ maxValueLong);

        long myLongNumber = 2147483647234L;



        byte myByte = 20;
        short myShort = 30000;
        int myInt = 123212321;
        long myLong = 50000 + 10 * (myByte + myShort + myInt);//1232473410
        System.out.println("myLong = "+ myLong);

        
    }
}
