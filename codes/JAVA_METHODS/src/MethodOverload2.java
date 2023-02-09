class Student {
    String name;
    int age;

    public void details(String name, int age) {
        System.out.println(name+" "+age);
    }

    public void details(String name) {
        this.name = name;
    }

    public void details(int age) {
        this.age = age;
    }
}
public class MethodOverload2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.details("sambeet");
        s1.details(20);
        s1.details(s1.name, s1.age);
    }
}
