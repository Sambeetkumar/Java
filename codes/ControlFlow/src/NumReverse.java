public class NumReverse {
    public static int isPalindrome(int number) {
        int reverse = 0, remainder;
        while (number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        return reverse;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(11));
        System.out.println(isPalindrome(-132));
        System.out.println(isPalindrome(23467));
    }
}
