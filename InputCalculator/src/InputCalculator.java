import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        int sum=0;
        int count=0;
        while (true) {
            if (scanner.hasNextInt()) {
                int temp = scanner.nextInt();
                sum += temp;
                count++;
            }else{
                break;
            }
            scanner.nextLine();

        }
        double avg = (double)sum/(double)count; // this is in order to pass a double value to Math.round to get an accurate result
        System.out.println("SUM = "+sum+" AVG = "+Math.round(avg));
        scanner.close();
    }
}
