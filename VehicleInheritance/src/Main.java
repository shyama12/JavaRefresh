public class Main {

    public static void main(String[] args) {
        Outlander outlander = new Outlander(50, "Aluminium", "Grey", 36);
        outlander.move(outlander.getSpeed());
        outlander.steer("right", 7);
        System.out.println(outlander.getDirection());
        outlander.changeGear("M");
        outlander.move(30);
        outlander.accellerate(20);
        outlander.accellerate(100);
        outlander.move(outlander.getSpeed());
    }


}
