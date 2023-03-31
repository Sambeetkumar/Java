import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomArray {
    public static void main(String[] args) {
        System.out.print("Enter the length of the array : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = getRandomArray(n);
        System.out.print("Randomly generated array : ");
        System.out.println(Arrays.toString(arr));
        System.out.print("Sorted Array : ");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        sc.close();
    }

    public static int[] getRandomArray(int size) {
        Random random = new Random();
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = random.nextInt(100);
        }
        return result;
    }
}