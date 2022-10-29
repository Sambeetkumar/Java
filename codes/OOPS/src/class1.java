import java.util.Scanner;

public class class1 {
    public static void main(String[] args) {
        //class2 sam = new class2();
        class2 obj = new class2();
        int n1 = obj.get_num();
        obj.set_num(n1);
    }
}
class class2 {
public  int get_num() {
    Scanner in = new Scanner(System.in);
    System.out.print("\tEnter a number : ");
    int x = in.nextInt();
    return x;
}
    public  void set_num(int a) {
        System.out.println("\tYou entered : " + a);
    }
}
