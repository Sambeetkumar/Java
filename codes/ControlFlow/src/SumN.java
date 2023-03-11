import java.util.Scanner;
public class SumN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("//program to find the sum of first N integers//");
        System.out.print("Enter the nth integer : ");
        int n = sc.nextInt();
        calc obj = new calc();
        System.out.println("Sum of first " + n + " integers : " + obj.sumCalc(n));
        sc.close();
    }
}

class calc {
    public int sumCalc(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum = sum + i;
        }
      return sum;
    }
}