package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 2; i < 9; i++) {
            System.out.println("10,000 at " + i + " % interest rate = " + String.format("%.2f", calculateInterest(10000.00, (double) i)));
        }
        int numberOfPrimeNumbers = 0;
        String primeNumbersString = "";
        for (int i = 1; i <= 100; i++) {
            if (isPrime(i)) {
                numberOfPrimeNumbers++;
                primeNumbersString += (i + " ");
                if (numberOfPrimeNumbers == 10) {
                    break;
                }
            }
        }
         System.out.println(" Number of prime numbers = " + numberOfPrimeNumbers);
        System.out.println("The prime numbers are : " + primeNumbersString);

        int countDraacula = 0;
        int sumOf5 = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                countDraacula++;
                sumOf5 += i;
                System.out.println(i);
                if (countDraacula == 5) {
                    break;
                }
            }
        }
        System.out.println("Sum of 5 = " + sumOf5);


    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
