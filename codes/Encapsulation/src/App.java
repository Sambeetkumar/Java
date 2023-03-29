public class App {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);

        printer.addToner(54);
        System.out.printf("New toner level is %d\n", printer.getTonerLevel());

        int numOfSheets = printer.printPages(13);
        System.out
                .println("current job pages : " + numOfSheets + "\nTotal pages printed : " + printer.getPagesprinted());
        ;
        numOfSheets = printer.printPages(16);
        System.out
                .println("current job pages : " + numOfSheets + "\nTotal pages printed : " + printer.getPagesprinted());
        ;
    }
}
