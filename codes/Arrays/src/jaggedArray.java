public class jaggedArray {
    public static void main(String[] args) {
        int[][] MyArray = new int[5][];
        for (int i = 0 ; i < MyArray.length; ++i){
            MyArray[i] = new int[i+1];
        }
        int count = 0;
        for (int i = 0; i < MyArray.length ; ++i){
            for (int j = 0; j < MyArray[i].length; ++j )
                MyArray[i][j] = ++count;
        }
        for (int i = 0; i < MyArray.length ; ++i){
            for (int j = 0; j < MyArray[i].length; ++j )
                System.out.print(MyArray[i][j]+" ");
            System.out.println("\n");
        }
    }
}
