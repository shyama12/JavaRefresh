package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(isPalindrome(0));
        System.out.println(isPalindrome(-3));
        System.out.println(isPalindrome(-9));
        System.out.println(isPalindrome(-10));
        System.out.println(isPalindrome(-11));
        System.out.println(isPalindrome(-23));
        System.out.println(isPalindrome(-3333));
    }



    public static boolean isPalindrome (int number) {
            int tempNumber = number;
            int reverse = 0;
            while (tempNumber != 0) {
                reverse += tempNumber % 10;
                tempNumber /= 10;
                if (tempNumber != 0) {
                    reverse *= 10;
                }
            }
                return number == reverse;

    }
}
