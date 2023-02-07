import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a month : ");
        String month = input.nextLine();
        System.out.println(month + " is in the " + getQuarter(month.toUpperCase()) + " Quarter");
        input.close();

    }
    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                String dummy = month + " is bad";
                yield dummy;
            }
        };
    }
}
