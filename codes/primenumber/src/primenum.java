import java.util.Scanner;

public class primenum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be checked : ");
        int value = sc.nextInt();
        boolean check = isPrime(value);
        if (check)
            System.out.println(value + " is a prime number");
        else
            System.out.println(value + " is not a prime number");
        sc.close();
    }

    public static boolean isPrime(int num) {
        int x = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                x++;
        }
        if (x == 2)
            return true;
            
        else
            return false;
    }
}
