package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        // Regex for 0 to 255
        // [0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5]
        // ^ --- begins with, * ---- any amount of and all characters or none at all
        // $ --- ends with, + ----- matches exactly one digit
        // ^[0-9]*$

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number : ");
        if (!scanner.hasNextInt()) {
            System.out.println("No valid numbers entered");
        } else {
            int current = scanner.nextInt();
            min = current;
            max = current;


            while (true) {
                System.out.println("Enter a number : ");
                if(!scanner.hasNextInt()){
                    break;
                }
                else{
                    current = scanner.nextInt();
                    scanner.nextLine();
                    if (current < min) {
                        min = current;
                    }
                    if (current > max) {
                        max = current;
                    }
                }

            }
            System.out.println("Minimum = "+ min);
            System.out.println("Maximum = "+ max);
        }
        scanner.hasNextInt(); // this is to catch the non-number input in both cases. Non number case: catch characters
                              // and new line character (by enter key). Number case: catch new line character (by enter key)
                              // put outside the if - else block to avoid duplicating code as the caught input is not used anywhere
        scanner.close();
    }
}
