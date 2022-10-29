public class Enum {
    public enum Days {
        Sunday,
        Monday,
        Tuesday,
        Wednesday,
        Thursday,
        Friday,
        Saturday
    }


    public static void main(String[] args) {
     for (Days d : Days.values())
         weeekend(d);
    }
    public static void weeekend( Days d){
        if(d.equals(Days.Sunday))
        {
            System.out.println(d+" is a Holiday");
        }
        else
            System.out.println(d+" is a working day");
    }
}
