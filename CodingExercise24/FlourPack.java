public class FlourPack {
    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1,0,5));
        System.out.println(canPack(3, 4, 14));
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        final int bigKilos = 5;
        final int smallKilos = 1;
        boolean pack;
        int sumBigKilosNeeded = 0;

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        /* Find the number of big flour bags that can be used to pack
        the goal amount. Exit the loop if the sum of the big flour bags
        is equal or close to the goal amount.  Amount close to the goal
        is between 1 - 4, inclusive*/
        while (bigCount > 0) {
            sumBigKilosNeeded = sumBigKilosNeeded + bigKilos;

            if (goal - sumBigKilosNeeded >= 1 && goal - sumBigKilosNeeded <= 4) {
                break;
            }
            --bigCount;
        }

        if (goal - sumBigKilosNeeded == 0) {
            pack = true;
        } else {
            pack = smallCount != 0 && (goal - sumBigKilosNeeded <= smallCount);
        }

        return pack;
    }
}
