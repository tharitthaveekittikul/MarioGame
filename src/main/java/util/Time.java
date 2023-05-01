package util;

public class Time {

    public static float timeStarted = System.nanoTime();

    public static float getTime(){
        // 1E-9 -> 10^-9
        return (float)((System.nanoTime() - timeStarted) * 1E-9);
    }
}
