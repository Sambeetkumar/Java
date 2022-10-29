public class MethodOverload {
    public float sum(float a,float b){
        return a+b;
    }
    public double sum(double x,double y,double m){
        return x+y+m;
    }

    public static void main(String[] args) {
        MethodOverload obj = new MethodOverload();
        float c = obj.sum(12,34);
        System.out.println("Result = "+c);
        double z = obj.sum(23.33f,56.88f,33.21);
        System.out.println("Result = "+z);
    }
}
