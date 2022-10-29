import java.io.*;
public class FileIOStream
{
    public static void main(String[] args)
    {
        byte item[] = {'a','b','c'};
        FileOutputStream out = null;
        FileInputStream in = null;
        File infile = new File("xyz.txt");
        try {
            out = new FileOutputStream(infile);
            for (int i = 0; i < item.length; i++) {
                out.write(item[i]);
            }
            out.close();
            in = new FileInputStream("xyz.txt");
            int size = in.available();
            for (int i = 0; i < size; i++) {
                System.out.print( (char) in.read() + " ");
            }
            in.close();
        }
        catch(IOException e)
        {
            System.out.println("IOException");
        }
    }
}
