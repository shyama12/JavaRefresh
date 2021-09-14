package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(252));
        System.out.println(sumFirstAndLastDigit(257));
        System.out.println(sumFirstAndLastDigit(0));
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(-108));
        System.out.println(sumFirstAndLastDigit(20002));
    }

    public static int sumFirstAndLastDigit (int number) {
        if (number<0) {
            return -1;
        }else{
            int lastDigit = number%10;
            int firstDigit = 0;
            while (number>0) {
                if(number/10==0) {
                    firstDigit = number%10;
                    break;
                }
                number /= 10;
            }
            return lastDigit+firstDigit;
        }
    }
}
