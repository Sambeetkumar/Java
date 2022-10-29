import java.io.*;

public class FileReadWrite {
    public static void main(String[] args) {
        FileWriter fw = null;
        FileReader fr = null;
        try {
            fw = new FileWriter("write.txt");
            fw.write("Hello i am new to java");
            fr = new FileReader("write.txt");
            int c;
            while ((c = fr.read()) != -1) {
                System.out.println((char)c+" ");
            }
            fw.close();
            fr.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
