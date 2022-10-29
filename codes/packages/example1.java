import package1.*;
import java.util.Scanner;
import static java.lang.Math.*;

public class example1 {
    public static void main(String[] args) {
        multiplication mul = new multiplication();
        p1 obj = new p1();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        float a = sc.nextFloat();
        System.out.println("square of the number : " + mul.square(a));
        System.out.println("cube of the number : " + mul.cube(a));
        System.out.println(mul.fact((int) a));
        obj.display();
        obj.display2();
        System.out.print("Enter the radius of the circle : ");
        float rad = sc.nextFloat();
        System.out.println("area = "+PI*rad*rad);
        sc.close();
    }
}