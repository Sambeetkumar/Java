interface ingerface1{
    public final static int var = 5;
    public int add(int a,int b);
}
public class interface1 implements ingerface1{
    int var = 10;
    public int add(int a,int b){return a+b;}
    public static void main(String[] args) {
        interface1 obj = new interface1();
        int s = obj.add(obj.var,ingerface1.var);
        System.out.println(s);
    }
}
