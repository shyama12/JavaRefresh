package com.company;

public class Main {

    public static void main(String[] args) {
    int number = 4;
    int finishNumber = 20;
    int count = 0;
        while (number <=20) {
            number++;
            if (!isEvenNumber(number)){
                continue;
            }
            if(count==5){
             break;
            }else{
                count++;
            }

            System.out.println("Even Number "+ number);
        }
        System.out.println("Even numbers found = "+count);

    }

    private static boolean isEvenNumber(int number) {
        if ((number%2==0)){
            return true;
        }else{
            return false;
        }
    }
}
