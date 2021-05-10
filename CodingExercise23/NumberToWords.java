public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(100);
    }
    public static void numberToWords(int number) {
        int reversed = 0;
        int digitCountOriginal = 0;
        int digitCountReversed = 0;

        if (number < 0) {
            System.out.println("Invalid Value");
        } else if (number == 0) {
            System.out.println("Zero");
        }

        digitCountOriginal = getDigitCount(number);

        reversed = reverse(number);
        digitCountReversed = getDigitCount(reversed);

        while (reversed > 0) {
            switch(reversed % 10) {
                case 0 :
                    System.out.print("Zero ");
                    break;
                case 1 :
                    System.out.print("One ");
                    break;
                case 2 :
                    System.out.print("Two ");
                    break;
                case 3 :
                    System.out.print("Three ");
                    break;
                case 4 :
                    System.out.print("Four ");
                    break;
                case 5 :
                    System.out.print("Five ");
                    break;
                case 6 :
                    System.out.print("Six ");
                    break;
                case 7 :
                    System.out.print("Seven ");
                    break;
                case 8 :
                    System.out.print("Eight ");
                    break;
                case 9 :
                    System.out.print("Nine ");
                    break;
                default:
                    System.out.print("Invalid Value");
            }

            reversed /= 10;
        }

        if (digitCountOriginal != digitCountReversed) {
            // print the words Zero
            for (int i = 0; i < digitCountOriginal - digitCountReversed; i++) {
                System.out.print("Zero ");
            }
        }
    }

    public static int getDigitCount(int number) {
        int count = 0;

        if (number < 0) {
            return -1;
        }
        while (number >= 10) {
            count++;
            number /= 10;
        }

        return count + 1;
    }

    public static int reverse(int number) {
        int digitCount = 0;
        int reversedNum = 0;
        boolean isNegative = false;

        if (number < 0) {
            isNegative = true;
            number *= -1;
        }

        digitCount = getDigitCount(number);
        for (int i = 0; i < digitCount; i++) {
            reversedNum = (reversedNum * 10) + (number % 10);
            number /= 10;
        }

        if (isNegative) {
            reversedNum *= -1;
        }
        return reversedNum;
    }
}
