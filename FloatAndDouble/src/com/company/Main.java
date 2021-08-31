package com.company;

public class Main {

    public static void main(String[] args) {

        float minFloatValue = Float.MIN_VALUE;
        float maxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + minFloatValue);
        System.out.println("Float maximum value = " + maxFloatValue);

        double minDoubleValue = Double.MIN_VALUE;
        double maxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + minDoubleValue);
        System.out.println("Double maximum value = " + maxDoubleValue);


        int myInt = 5;
        float myFloat = 5f;
        double myDouble = 5d;

        System.out.println(myInt/3);
        System.out.println(myFloat/3f); //precision set to 7 digits
        System.out.println(myDouble/3d); //precision set to 16 digits

        double poundValue = 200d;
        double kiloValue = poundValue * 0.45359237d;
        System.out.println(poundValue + " pound(s) is " + kiloValue + " kilograms.");

    }
}
