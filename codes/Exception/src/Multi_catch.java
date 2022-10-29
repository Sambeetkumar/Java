public class Multi_catch {
    public static void main(String[] args) {
        int a = 20,b = 10;
        int num;
        int[] arr ={2,3,4};
        try {
            num = a/b;
            System.out.println("the value of num is "+num);
            for(int i = 5; i>= 0; i--)
            {
                System.out.println("the value of the array : "+arr[i]);
            }
        }
        catch (ArithmeticException e){
            System.out.println("Division by zero "+e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index error "+e);
        }
        catch (ArrayStoreException e){
            System.out.println("Wrong data type "+e);
        }
    }
}
