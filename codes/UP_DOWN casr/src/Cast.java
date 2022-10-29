class parent{
    String name;
    public void PrintMessage()
    {
        System.out.println("Message from parent class");
    }
    public void printparent(){
        System.out.println("Hello");
    }
}
class child extends parent{
    int id;
    public void PrintMessage()
    {
        System.out.println("Message from child class");
    }
    public void printchild(){
        System.out.println("Hii");
    }
}
public class Cast {
    public static void main(String[] args) {
        parent par = new child();
        child obj = (child) par;
        obj.name = "sambeet";
        System.out.println(obj.name);
        obj.printchild();
        par.PrintMessage();
        par.printparent();
        obj.PrintMessage();
        System.out.println(par.name);
    }
    public static void MakeSound(parent parent)
    {
        parent.PrintMessage();
    }
}
