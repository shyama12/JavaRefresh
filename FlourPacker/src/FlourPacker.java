public class FlourPacker {

    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if(bigCount<0 || smallCount<0 || goal<0) {
            return false;
        }

        System.out.println("Big = "+bigCount+ "   Small = "+smallCount+"   Goal = "+goal);

        if( goal <= (bigCount*5 + smallCount)) {
            int tempBig = 0;
            while (tempBig<=bigCount) {
                System.out.println("Temp Big = " + tempBig);
                if (goal==(tempBig*5)) {
                    return true;
                }
                if(((((tempBig*5)+5)>=goal)||(tempBig+1>bigCount)) && smallCount!=0) {
                    int tempSmall = 0;
                    System.out.println("Temp Small =" + tempSmall);
                    while (tempSmall <= smallCount) {
                        System.out.println("tempBig*5 + tempSmall = "+((tempBig*5) + tempSmall));
                        if (goal == (tempBig*5) + tempSmall) {
                            return true;
                        }
                        tempSmall++;
                    }

                }

                tempBig++;
            }

        }
        return false;
    }
}
