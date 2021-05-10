public class DecimalComparator{
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        int first = (int) (num1 * 1000);
        int second = (int) (num2 * 1000);
        
        if (first == second) {
            return true;
        }
        
        return false;
    }
}