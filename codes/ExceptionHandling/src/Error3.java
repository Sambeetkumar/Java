public class Error3 {
    public static void main(String[] args) {
        int a[] = { 5, 10 };
        int b = 5;
        try {
            int c = a[2] / (a[0] - b);
        } catch (ArithmeticException e) {
            System.out.println("division by zero !");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array index error !");
        } catch (ArrayStoreException e) {
            System.out.println("Wrong data type !");
        }
        int d = a[1] / (a[1] - a[0]);
        System.out.println("D = " + d);
    }

}
