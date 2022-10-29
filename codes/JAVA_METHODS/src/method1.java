public class method1 {
    public static void main(String[] args) {
        int position = CalculatePosition(1500);
        DisplayHighSorePosition("sambeet",position);
        position = CalculatePosition(900);
        DisplayHighSorePosition("sam",position);
        position = CalculatePosition(400);
        DisplayHighSorePosition("alex",position);
        position = CalculatePosition(50);
        DisplayHighSorePosition("nilua",position);
    }
    public static void DisplayHighSorePosition(String playername , int position){
        System.out.println(playername+" managed to get into position "+position+" in the high score table ");
    }
    public static int CalculatePosition(int highscore){
        if(highscore >= 1000)
            return 1;
        else if (highscore >= 500)
            return 2;
        else if (highscore >= 100)
            return 3;
        else
            return 4;
    }
}
