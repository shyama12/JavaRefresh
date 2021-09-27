public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(10, 0, false);

        printer.addToner(20);
        printer.printPages(200);
    }
}
