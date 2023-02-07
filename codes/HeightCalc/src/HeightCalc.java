import java.util.Scanner;
public class HeightCalc {
    public static void main(String[] args) {
        int feet,inch;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your height");
        System.out.print("Feet : ");
        feet = input.nextInt();
        System.out.print("Inches : ");
        inch = input.nextInt();
        System.out.println("Your height in cm is " + convertToCentimeters(feet, inch));
        input.close();
    }
    public static double convertToCentimeters(int inches){

        return inches*2.54;
    }
    public static double convertToCentimeters(int feet,int inches){
        int height = 12*feet+inches;
        double heightInInch = convertToCentimeters(height);
        return heightInInch;
    }
}
