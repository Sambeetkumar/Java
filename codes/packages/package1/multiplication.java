package package1;

public class multiplication {
    public float square(float a) {
        return a * a;
    }

    public float cube(float b) {
        return b * b * b;
    }

    public int fact(int c) {
        int fact = 1;
        for (int i = 1; i <= c; ++i) {
            fact = fact * i;
        }
        return fact;
    }
}