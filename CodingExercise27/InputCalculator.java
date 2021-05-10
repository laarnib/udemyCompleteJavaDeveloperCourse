import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int count = 0;

        while(true) {
            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int number = scanner.nextInt();
                sum += number;
                count += 1;
            } else {
                break;
            }
        }

        if (count > 0) {
            avg = Math.round((double)sum / count);
        }

        System.out.printf("SUM = %d AVG = %d%n", sum, avg);
    }
}
