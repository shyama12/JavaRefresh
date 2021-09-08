package com.company;

public class Main {

    public static void main(String[] args) {
        int myNum = 10;
        int result = 10 + 1;
        System.out.println(" Result = " + result);
        result = result - 1;
        System.out.println(" Result = " + result);
        result = result * 10;
        System.out.println(" Result = " + result);
        result = result / 10;
        System.out.println(" Result = " + result);
        result = result % 10;
        System.out.println(" Result = " + result);


        result = 10;
        //ABBREVIATED OPERANDS
        result++;
        System.out.println(" Result = " + result);
        result--;
        System.out.println(" Result = " + result);
        result += 2;
        System.out.println(" Result = " + result);
        result -= 2;
        System.out.println(" Result = " + result);
        result *= 10;
        System.out.println(" Result = " + result);
        result /= 10;
        System.out.println(" Result = " + result);


        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");

        int score = 92;

        // >= operator
        if (score >= 90) {
            System.out.println("High Score!");
        }
        // logical AND
        if ((score >= 80) && (score < 90)) {
            System.out.println("Second High Score!");
        }

        //logical OR
        if ((score < 80) || (score >= 90)) {
            System.out.println("You did not score in the 80s!");
        }

        //check inside the if condition. isCar is type boolean
        //which is assigned inside the brackets giving value true

        //same will not work if we use an int..
        // as it will throw and error
        //for eg. int car = 50; if(car = 30)
        // in this case it will say int appears where boolean is expected
        boolean isCar = false;
        if (isCar = true) { // this is wrong
            System.out.println("It is a car!");
        }

        if (isCar) {
            System.out.println("Is car!");
        }

        //not operator
        if (!isCar) {
            System.out.println("Not a car");
        }

        // Ternary Operator (short if-else)

        int testNumber = 30;
        int sumOfDigits = (testNumber == 0) || (testNumber % 9 != 0) ? (testNumber % 9) : 9;
        System.out.println("Sum of digits = " + sumOfDigits);


        int counter = 10;
        System.out.println("Counter = " + counter);
        System.out.println("Counter = " + (++counter));
        System.out.println("Counter = " + counter);
        System.out.println("Counter = " + (counter++));
        System.out.println("Counter = " + counter);


        double variable1 = 20.00d;
        double variable2 = 80.00d;
        double variable3 = (variable1 + variable2) * 100.00d;
        double remainder = variable3 % 40.00d;

        boolean noRemainder = remainder == 0 ? true : false;
        System.out.println("noRemainder = " + noRemainder);
        if (!noRemainder) {
            System.out.println("Got some remainder");
        }
    }
}
