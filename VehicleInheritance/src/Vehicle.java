import java.util.Locale;

public class Vehicle {

    private String id;
    private String brand;
    private String model;
    private double speed;
    private int wheels;
    private boolean automatic;
    private String body;
    private double weight;
    private int direction;

    public Vehicle(String id, String brand, String model, double speed, int wheels, boolean automatic, String body, double weight, int direction) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        this.wheels = wheels;
        this.automatic = automatic;
        this.body = body;
        this.weight = weight;
        this.direction = direction;

    }

    public void steer(String rOrL, int factor) {

        if (rOrL.toLowerCase().equals("right")){
            if ((direction+factor)>10) {
                this.direction = 10;
            }else {
                this.direction += factor;
            }
        }else if (rOrL.toLowerCase().equals("left")){
            if ((direction-factor)<-10) {
                this.direction = -10;
            }else {
                this.direction -= factor;
            }
        }else{
            System.out.println("Invalid direction");
        }
        System.out.println("Vehicle Steered");
    }

    public void changeSpeed ( double speed ) {
        this.speed = speed;
        System.out.println("Speed changed to "+speed);
    }

    public void stop () {
        this.speed = 0;
        System.out.println("Vehicle stopped");
    }



    public void move(double speed) {
        this.speed = speed;
        System.out.println("Vehicle moving at "+speed+" km/h in direction "+direction);
    }

    public String getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getSpeed() {
        return speed;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public String getBody() {
        return body;
    }

    public double getWeight() {
        return weight;
    }

    public int getDirection() {
        return direction;
    }
}
