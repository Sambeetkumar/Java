import java.util.Scanner;
public class GuessNum {
    public static void main(String[] args) {
        int mynum = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        int i = 0;
        do{
            System.out.print("Guess the number(1 - 100) : ");
            i = sc.nextInt();
            if(i == mynum){
                System.out.println("Correct guess");
                break;
            }
            else if(i > mynum){
                System.out.println("Your guess is too large");
            }
            else{
                System.out.println("Your guess is too small");
            }
        } while (i >= 0);
        System.out.println("my number was : " + mynum);
        sc.close();
    }
}
