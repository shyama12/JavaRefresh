public class Dog extends Animal{


    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;

    }

    public void chew(){
        System.out.println("Nom nom nom");
    }

    @Override
    public void eat() {
        super.eat();
        this.chew();
    }

    public void walk() {
        super.move(5); // using super because if in the future we want to add
                             // something unique to the move method, that is override
                             // move inside the Dog class
        // if move has been overridden, we have to remove super keyword to access it

    }

    public void run() {
        move(10);       //this takes move if available in this calss
                              // otherwise it takes from super class

    }


    @Override
    public void move(int speed) {
        moveLegs();
        super.move(speed);
    }

    private void moveLegs() {
        System.out.println("Dog moves legs.");
    }
}
