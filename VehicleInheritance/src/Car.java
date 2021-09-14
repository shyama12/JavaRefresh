public class Car extends Vehicle{
    private int seats;
    private String color;
    private String currentGear;
    private int gear;


    public Car(String id, String brand, String model, double speed,
               boolean automatic, String body, double weight, int gear, int direction, int seats,
               String color, String currentGear) {
        super(id, brand, model, speed, 4, automatic, body, weight, direction);
        this.seats = seats;
        this.color = color;
        this.currentGear = currentGear;
        this.gear = gear;
    }



    @Override
    public void move(double speed) {
        if (speed>0 && speed<200) {
            super.move(speed);
        }else{
            System.out.println("Invalid speed");
        }
    }



    public void changeGear(String currentGear) {
        if (currentGear.equals("P")||currentGear.equals("R")||currentGear.equals("N")||
                currentGear.equals("1")||currentGear.equals("2")||currentGear.equals("3")||
                currentGear.equals("4")||currentGear.equals("5")) {
            this.currentGear = currentGear;
            System.out.println("Gear changed to "+this.currentGear);
        }else{
            System.out.println("Invalid gear");
        }
    }

    @Override
    public void steer(String rOrL, int factor) {
        super.steer(rOrL, factor);
    }

    public int getSeats() {
        return seats;
    }

    public String getColor() {
        return color;
    }

    public String getCurrentGear() {
        return currentGear;
    }

    public int getGear() {
        return gear;
    }
}
