import java.util.Scanner;

public class Sorting {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] MyArray = getIntegers(5);
        int[] Sorted = SortArray(MyArray);
        PrintArray(Sorted);
    }
    public static int[] getIntegers(int num)
    {
        System.out.println("Enter Integers to be sorted");
        int[] Array = new int[num];
        for(int i = 0; i < Array.length; ++i)
        {
            Array[i] = sc.nextInt();
        }
        return Array;
    }
    public static void PrintArray(int [] array){
        System.out.println("Sorted elements are as follows\n");
        for (int i=0; i<array.length;i++){
            System.out.print(array[i] + " ");
        }
    }
    public static int[] SortArray(int[] array){
        int[] sortedArray = new int[array.length];
        for(int i=0; i<array.length; i++) {
            sortedArray[i] = array[i];
        }

        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for(int i=0; i<sortedArray.length-1; i++) {
                if(sortedArray[i] < sortedArray[i+1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
