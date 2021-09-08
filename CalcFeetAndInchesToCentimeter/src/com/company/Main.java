package com.company;

public class Main {

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if (feet >= 0 && inches >= 0 && inches <= 12) {
            double feetToInches = feet * 12d;
            double totalInches = feetToInches + inches;
            System.out.println(feet+" feet, "+ inches+" inches = "+totalInches*2.54+ " centimeters");
            return totalInches * 2.54d;
        }
        return -1;
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if (inches >= 0) {
            int feet = (int) inches/12;
            double remainingInches = (int) inches%12;
            System.out.println(feet);
            System.out.println(remainingInches);
             return calcFeetAndInchesToCentimeters((double)feet, remainingInches);
        }
        return -1;
    }
    public static void main(String[] args) {
	calcFeetAndInchesToCentimeters(100);
    }
}
