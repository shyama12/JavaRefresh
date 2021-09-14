public class Outlander extends Car{

    private int roadServiceMonths;


    public Outlander(double speed, String body, String color, int roadServiceMonths) {
        super("1WQLOA", "Mitsubishi", "Outlander", speed, true, body, 400.00, 5, 0, 5, color, "N");
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accellerate (int rate){
        double newSpeed = this.getSpeed() + rate;
        if (newSpeed == 0) {
            changeGear("N");
            stop();
        } else if (newSpeed>0 && newSpeed<=20) {
            changeGear("1");
        }else if (newSpeed>20 && newSpeed<=50) {
            changeGear("2");
        }else if (newSpeed>50 && newSpeed<=80) {
            changeGear("3");
        }else if (newSpeed>80 && newSpeed<=120) {
            changeGear("4");
        }else {
            changeGear("5");
        }

        changeSpeed(newSpeed);
    }
}
