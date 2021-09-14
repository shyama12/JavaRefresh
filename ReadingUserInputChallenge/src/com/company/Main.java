package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        int sum = 0;
        while(counter < 10) {
            System.out.println("Enter number #"+(counter+1)+": ");
            if(scanner.hasNextInt()){
                int number =scanner.nextInt();
                counter++;
                sum += number;
            }else{
                System.out.println("Invalid Input try again. ");

            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Sum of the 10 numbers = "+sum);
    }
}
