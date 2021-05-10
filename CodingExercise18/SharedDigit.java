public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        int digit1 = num1 % 10;
        int digit2 = num1 / 10;

        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        for(int i = 0; i < 2; i++) {
            if(num2 % 10 == digit1 || num2 % 10 == digit2) {
                return true;
            }
            num2 /= 10;
        }

        return false;
    }
}