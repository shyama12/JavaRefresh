public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays( long minutes ) {
        if ( minutes<0 ){
            System.out.println("Invalid value");
        }else{
            long days = 0;
            long years = 0;
            if (minutes/1440!=0){
                days = minutes/1440;
                if(days/365!=0){
                    years = days/365;
                    days = days%365;
                }
            }

            System.out.println(minutes+" min = "+years+" y and "+days+" d");

        }

    }
}
