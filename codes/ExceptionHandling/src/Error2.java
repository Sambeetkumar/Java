public class Error2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 5;
        try {
            int x = a / (b - c);
        } catch (ArithmeticException e) {
            System.out.println("Division by zero !");
        }
        int y = a / b + c;
        System.out.println("Y = " + y);
    }

}
