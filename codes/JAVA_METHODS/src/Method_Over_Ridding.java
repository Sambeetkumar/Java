class A{
    public int sam(){
        return 215;
    }
    public void display2(){
        System.out.println("i am method 2 of class A");
    }
}
class B extends A{
    @Override
    public void display2(){
        System.out.println("i am a method of class B");
    }
}
public class Method_Over_Ridding {
    public static void main(String[] args) {
        A f = new A();
        f.display2();
        B b = new B();
        b.display2();
        System.out.println(b.sam());
    }
}
