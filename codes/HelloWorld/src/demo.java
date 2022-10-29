public class demo {
    public static void main(String[] args){
        int n = 30;
        if(n%5 == 0 && n%3 == 0)
        {
            n +=n;
            System.out.println(++n+" ");
        }
        n++;
        System.out.println(++n+" "+"bye");
    }
}
