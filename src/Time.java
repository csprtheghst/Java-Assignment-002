public class Time {
    public static void main(String[] args) {

        int hour = 14;
        int minute = 0;
        int second = 0;
        int secondsSinceMidnight = hour * 3600 + minute * 60 + second;
        System.out.println("Seconds since midnight: " + secondsSinceMidnight);
        int secondsInADay = 24 * 3600;
        int secondsRemaining = secondsInADay - secondsSinceMidnight;
        System.out.println("Seconds remaining in the day: " + secondsRemaining);
        double percentageOfDayPassed = (double) secondsSinceMidnight / secondsInADay * 100;
        System.out.println("Percentage of the day passed: " + percentageOfDayPassed + "%");
        hour = 16;
        minute = 30;
        second = 15;
        int elapsedSeconds = (hour * 3600 + minute * 60 + second) - secondsSinceMidnight;
        System.out.println("Elapsed time since starting the exercise: " + elapsedSeconds + " seconds");
    }
}
