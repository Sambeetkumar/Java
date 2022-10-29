public class vehicle {
    protected String brand = "Ford";

    public void Rush() {
        System.out.println("Go like Hell...!! 7000+");
    }

    static class car extends vehicle {
        private String ModelName = "GT40 #1 ken Miles";
    }

    public static void main(String[] args) {
        car MyFirstCar = new car();
        MyFirstCar.Rush();
        // vehicle v = new vehicle();
        System.out.println(MyFirstCar.brand + " " + MyFirstCar.ModelName);
    }
}
