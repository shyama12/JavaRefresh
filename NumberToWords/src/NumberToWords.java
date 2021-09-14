public class NumberToWords {
    public static int reverse(int reverse) {
        int tempNum = reverse;
        int reversedNum = 0;
        while (tempNum != 0) {
            reversedNum += tempNum % 10;
            tempNum /= 10;
            if (tempNum != 0) {
                reversedNum *= 10;
            }
        }
        return reversedNum;
    }

    public static void numberToWords(int number) {

        int reversedNum = reverse(number);
        if(reversedNum < 0) {
            System.out.println("Invalid Value");
        }else{
            int digitsCount = getDigitCount(number);
            int tempNum = reversedNum;
            int digitToPrint;
            do {
                digitToPrint = tempNum % 10;
                switch (digitToPrint) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }

                tempNum /= 10;
            } while (tempNum > 0);

            if (getDigitCount(reversedNum) < getDigitCount(number)) {
                for (int i = 0; i < getDigitCount(number) - getDigitCount(reversedNum); i++) {
                    System.out.println("Zero");
                }
            }
        }

    }

    public static int getDigitCount (int number) {
        if(number<0){
            return -1;
        }
        return Integer.toString(number).length();
    }

}
