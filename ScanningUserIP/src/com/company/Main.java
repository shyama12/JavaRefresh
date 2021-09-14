package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        System.out.println("Please Enter Your Age : ");
        boolean hasNextInt = scanner.hasNextInt();
        if(hasNextInt) {
            int age = scanner.nextInt();
            scanner.nextLine(); // to catch the next-line character the user enters while pressing enter key
            System.out.println("Please Enter Your Name : ");
            String name = scanner.nextLine();
            System.out.println("Hi " + name + ", you are " + age + " years old.");
        } else {
            System.out.println("Unable to pass age");
        }
        }
}
