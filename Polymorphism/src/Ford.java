public class Ford extends Cars{
    private String color;

    public Ford(int cylinder, String name, String color) {
        super(cylinder, name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void startEngine() {
        System.out.println("Ford Starting up....");
        super.startEngine();
    }

    @Override
    public void brake() {
        System.out.println("Ford braking....");
        super.brake();
    }

    @Override
    public void accelerate(int rate) {
        System.out.println("Ford speeding...");
        super.accelerate(rate);
    }
}
