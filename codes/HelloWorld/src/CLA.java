public class CLA {
    public static void main(String[] args) {
        int number, fact = 1;
        number = Integer.parseInt(args[0]);
        for (int i = 1; i <= number; ++i) {
            fact = fact * i;
        }
        System.out.println("factorial of " + args[0] + " is equal to " + fact);
    }
}
