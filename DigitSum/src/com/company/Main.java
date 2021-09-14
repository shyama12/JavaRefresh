package com.company;

public class Main {

    public static int sumDigits ( int number) {
        if (number >=10) {
        int tempNum = number;
        int extractedDigit = 0;
        int sum = 0;

        while(tempNum!=0) {
            //extracting the LSD
            extractedDigit = tempNum%10;
            //losing the LSD
            tempNum /= 10;
            sum += extractedDigit;

        }
            return sum;

        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(sumDigits(32123));
    }
}
