public class LargestPrimeFactor {
    public static void main(String[] args) {
        System.out.println(getLargestPrimeFactor(8));
    }

    public static int getLargestPrimeFactor(int number) {
        int largest = 0;
        boolean isPrime = false;

        if (number <= 1) {
            return -1;
        }

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {

                // Check if factor is prime
                isPrime = isPrime(i);

                if (isPrime) {
                    largest = i;
                }
            }
        }
        return largest;
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int j = 2; j <= number/2; j++) {
            if (number % j == 0) {
                return false;
            }
        }
        return true;
    }
}


