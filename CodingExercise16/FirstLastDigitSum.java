public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        int sum = 0;

        if (number < 0) {
            return -1;
        } else if (number < 10) {
            sum = number + number;
        } else {
            int last = number % 10;

            // find the first digit
            while (number >= 10) {
                number /= 10;
            }

            sum = number + last;
        }
        return sum;
    }
}