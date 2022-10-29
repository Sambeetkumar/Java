package package1;

public class p1 extends p2{
    public void display() {
        System.out.println("From class p1");
    }
}
class p2 {
    int a = 20;

    public void display2()
    {
        System.out.println("From class p2"+" a = "+a);
    }
}