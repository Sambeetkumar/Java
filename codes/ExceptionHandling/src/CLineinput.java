public class CLineinput {
    public static void main(String[] args) {
        int number, invalid = 0;
        int count = 0;
        for (int i = 0; i < args.length; ++i) {
            try {
                number = Integer.parseInt(args[i]);
            } catch (NumberFormatException e) {
                invalid = invalid + 1;
                System.out.println("invalid numbers = " + args[i]);
                continue;
            }
            count = count + 1;
        }
        System.out.println("invalid numbers = " + invalid);
        System.out.println("valid numbers = " + count);
    }

}
