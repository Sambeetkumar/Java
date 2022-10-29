public class Try_Nest {
    public static void main(String[] args) {
        try {
            int a = 2,b = 4,c = 2,d = 7,x;
            int[] arr = {2};
            try{
                x = d/(b*b - 4*a*c);
            }
            catch (ArithmeticException e){
                System.out.println("Division by zero");
            }
            arr[3] = 23;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds");
        }
    }
}
