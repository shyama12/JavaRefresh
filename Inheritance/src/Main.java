public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Spiderey", 1, 1, 1, 1);
        Dog dog = new Dog("Champ", 10, 100, 2 ,2, 1, 28, "Silky");

        dog.eat();
        dog.walk();
        dog.run();

    }
}
