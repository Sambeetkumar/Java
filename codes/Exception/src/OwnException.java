class NegativeRadiusException extends Exception {
    public NegativeRadiusException(String message) {
        super(message);
    }
}
public class OwnException {
    public static float area( float r) throws NegativeRadiusException{
        if (r<0)
            throw new NegativeRadiusException("Radius cannot be negative");
        else
        return (float)Math.PI*r*r;
    }

    public static void main(String[] args) {
        try {
            float result = area(-34.44f);
            System.out.println("Area of the circle is "+ result);
        }
        catch (NegativeRadiusException e) {
            System.out.println(e.getMessage());
        }
        try {
            float result = area(34.44f);
            System.out.println("Area of the circle is "+ result);
        }
        catch (NegativeRadiusException e) {
            System.out.println(e.getMessage());
        }
    }

}
