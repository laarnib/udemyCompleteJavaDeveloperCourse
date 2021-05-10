public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hour) {
        boolean wakeUp = false;
        
        if (barking == true && ((hour >= 0 && hour < 8) || (hour > 22 && hour < 24))) {
            wakeUp = true;
        } 
        
        return wakeUp;
    }
}