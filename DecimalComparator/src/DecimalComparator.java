import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces (double firstNumber, double secondNumber) {

        DecimalFormat df = new DecimalFormat(".000");
        df.setRoundingMode(RoundingMode.DOWN);
        double newFN = Double.parseDouble(df.format(firstNumber));
        double newSN = Double.parseDouble(df.format(secondNumber));
        return Double.compare(newFN, newSN)==0;


    }
}