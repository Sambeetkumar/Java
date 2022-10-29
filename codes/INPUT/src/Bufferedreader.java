
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
import java.io.*;

public class Bufferedreader {
    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(in);
        int x = 0;
        String str = null;
        try {
            System.out.print("\tEnter an integer : ");
            x = Integer.parseInt(input.readLine());
            System.out.print("\tEnter a line : ");
            str = input.readLine();
        } catch (IOException e) {
            System.out.print("caught IO Exception");
        }
        System.out.println("\tvalue of x : " + x);
        System.out.println("\tEntered String : " + str);
    }
}
