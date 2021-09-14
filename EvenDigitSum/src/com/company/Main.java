package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(hasSharedDigit(12,13));
    }

    public static boolean hasSharedDigit ( int number1, int number2 ) {
        if ( number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) {
            System.out.println("Invalid Value(s)");
            return false;
        }

        boolean haveCommonDigit = false;
        int temp1 = number1;
        int tempDigit1 = 0;
        int tempDigit2 = 0;

        while (temp1 > 0) {
            tempDigit1 = temp1%10;

            int temp2 = number2;
            while (temp2 > 0) {
                tempDigit2 = temp2%10;
                if (tempDigit2== tempDigit1) {
                    haveCommonDigit = true;
                    break;
                }
                temp2 /= 10;
            }
            temp1 /= 10;
        }
        return haveCommonDigit;
    }
}
