public class barking_dog {
    public static boolean ShouldWakeUp(boolean barking,int hourofday){
        if(barking &&(hourofday >= 0 && hourofday <= 23))
        {
            if(hourofday < 8 || hourofday > 22)
                return true;
            else return false;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        boolean result = ShouldWakeUp(true,1);
        System.out.println(result);
        result = ShouldWakeUp(false,2);
        System.out.println(result);
        result = ShouldWakeUp(true,8);
        System.out.println(result);
        result = ShouldWakeUp(true,23);
        System.out.println(result);
    }
}
