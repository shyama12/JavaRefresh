public class Main {

    public static void main(String[] args) {
        Camry camry = new Camry(2, "Camry", "white");
        camry.startEngine();
        camry.accelerate(30);
        camry.brake();

        Ford ford = new Ford(2, "Ford", "white");
        ford.startEngine();
        ford.accelerate(30);
        ford.brake();
    }
}
