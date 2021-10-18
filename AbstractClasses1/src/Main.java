import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Pengiun pengiun = new Pengiun("Emperor");
        pengiun.breathe();
        pengiun.eat();
        pengiun.fly();

    }
}
