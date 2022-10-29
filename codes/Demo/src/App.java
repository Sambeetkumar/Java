import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        String MyName = "sambeet";
        System.out.println(MyName);

        int[] arr = { 34, 12, 45, 78, 99, 05 };

        System.out.println("Before sorting");

        for (int i = 0; i < 6; ++i) {
            System.out.print(arr[i] + " ");
        }
        Arrays.sort(arr);
        System.out.println("\nAfter Sorting");

        for (int i = 0; i < 6; ++i) {
            System.out.print(arr[i] + " ");
        }

    }
}
