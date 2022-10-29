
class HelloAgain {
    public String color = "red";
    public int MaxSpeed = 127;

    public void display() {
        System.out.println("I'm a class method");
    }
}

class car {

    public static void main(String args[]) {
        HelloAgain car1 = new HelloAgain();
        System.out.println("cari is " + car1.color);
        car1.MaxSpeed = 687;
        System.out.println("car1 speed is " + car1.MaxSpeed);
        HelloAgain car2 = new HelloAgain();
        car2.color = "sky blue";
        System.out.println("qar2 is " + car2.color);
        car2.MaxSpeed = 779;
        System.out.println("car2 speed is " + car2.MaxSpeed);

    }
}
