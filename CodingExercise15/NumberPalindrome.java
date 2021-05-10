public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number = number * -1;
        }

        int originalNumber = number;
        int reverse = 0;

        while (number > 0) {
            reverse = reverse * 10 + number % 10;
            number /= 10;
        }

        if (originalNumber == reverse) {
            return true;
        }

        return false;
    }
}