public class Camry extends Cars{
    private String color;

    public Camry(int cylinder, String name, String color) {
        super(cylinder, name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void startEngine() {
        System.out.println("Camry Starting up....");
        super.startEngine();
    }

    @Override
    public void brake() {
        System.out.println("Camry braking....");
        super.brake();
    }

    @Override
    public void accelerate(int rate) {
        System.out.println("Camry speeding...");
        super.accelerate(rate);
    }
}
