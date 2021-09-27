public class Cars {

    private int cylinder;
    private String name;
    private int wheels;
    private boolean engine;
    private int speed;

    public Cars(int cylinder, String name) {
        this.cylinder = cylinder;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public void startEngine () {
        this.engine = true;
        System.out.println("Engine started");
    }

    public void accelerate ( int rate ) {
        this.speed += rate;
        System.out.println("New speed is "+speed+" km/h");
    }

    public void brake () {
        this.speed = 0;
        System.out.println("Car stopped");
    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }
}
