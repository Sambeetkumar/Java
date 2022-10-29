interface I1 {
    static final int x = 23;
    int Sum(int a, int b);
}
class sum implements I1{
    int y;
    @Override
    public int Sum(int a, int b) {
        return a+b;
    }

    int mul(int a, int b){
        return a*b;
    }
}

public class Interface_ex{
    public static void main(String[] args) {
        sum obj = new sum();

    }
}
