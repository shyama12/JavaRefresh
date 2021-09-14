public class LargestPrime {

    public static int getLargestPrime (int number) {
        if (number<=1) {
            return -1;
        }


        boolean numberIsPrime = true;

        boolean isPrime = true;
        int divisor = number/2;
        while (divisor>1) {
            if(number%divisor==0){
                isPrime = false;
            }
            divisor--;
        }
        if (isPrime) {
            return number;
        }

        for (int i = number/2; i > 0 ; i--) {
            if(number%i==0) {

                isPrime = true;
                divisor = i/2;
                while (divisor>1) {
                    if(i%divisor==0){
                        isPrime = false;
                    }
                    divisor--;
                }

                if (isPrime){
                    return i;
                }else{
                    return getLargestPrime(i);
                }
            }
        }
        return -1;
    }
}
