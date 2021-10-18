import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    public static void main(String[] args) {


        // Below is the code for Local Inner classes.. defined within a scope
        /*class ClickListener implements Button.OnClickListener{
            public ClickListener(){
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title+" was clicked");
            }
        }
        btnPrint.setOnClickListener(new ClickListener());*/


        //Below code is foe anonymous classes.. with no name.. created while trying to create object on interface
        btnPrint.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println("You clicked "+title+" button");
            }
        });

        listen();


        //Below code is for the Non - static Inner class example

        //        Gearbox mcLaren = new Gearbox(6);
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(1);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(1000));
//        mcLaren.changeGear(2);
//        System.out.println(mcLaren.wheelSpeed(3000));
//        mcLaren.operateClutch(true);
//        mcLaren.changeGear(3);
//        mcLaren.operateClutch(false);
//        System.out.println(mcLaren.wheelSpeed(6000));


        //below code is for when the inner class is public
        //but usually its coded as private (best practice)

        /*Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
        Gearbox.Gear second = mcLaren.new Gear(2, 15.4);
        System.out.println(first.driveSpeed(1000));
        System.out.println(second.driveSpeed(1000));*/

    }


    private static void listen(){
        boolean quit = false;
        while(!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();

            }

        }
    }


}
