public class DiagonalStar {

    public static void printSquareStar (int number) {
        if (number<5){
            System.out.println("Invalid Value");
        } else{

            for (int i = 0; i <= number-1; i++) {

                String row = "";
                for (int j = 0; j <= number-1; j++) {
                    if(i==0||i==(number-1)||i==j||i==(number-1-j)||j==0||j==(number-1)) {
                        row += "*";
                    }else{
                        row += " ";
                    }
                }
                System.out.println(row);
            }
        }
    }
}
