package com.company;

public class Main {

    public static int greatestCommonDivisor (int first, int second) {
       if (first < 10 || second < 10) {
           return -1;
       }

       int SP = Math.min(first, second);
       int GCD = 1;

       while (SP>1) {
           if((first%SP== 0) && (second%SP==0)) {
               return SP;
           }
           SP--;
       }
       return 1;
    }
    public static void main(String[] args) {
        System.out.println(greatestCommonDivisor(25, 15));
        System.out.println(greatestCommonDivisor(12, 30));
        System.out.println(greatestCommonDivisor(9, 18));
        System.out.println(greatestCommonDivisor(81, 153));
    }
}
