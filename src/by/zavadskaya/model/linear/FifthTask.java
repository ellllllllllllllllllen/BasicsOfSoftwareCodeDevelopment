package by.zavadskaya.model.linear;

public class FifthTask {

    public static final int SECONDS_IN_HOUR = 3600;
    public static final int SECONDS_IN_MINUTE = 60;

    public static double countTheHours(int numberOfSeconds) {
        return numberOfSeconds / SECONDS_IN_HOUR;
    }

    public static double countTheMinutes(int numberOfSeconds) {
        return (numberOfSeconds - (FifthTask.countTheHours(numberOfSeconds) * SECONDS_IN_HOUR)) / SECONDS_IN_MINUTE;
    }

    public static double countTheSeconds(int numberOfSeconds) {
        return numberOfSeconds - ((int) FifthTask.countTheHours(numberOfSeconds) * SECONDS_IN_HOUR)
                - ((int) FifthTask.countTheMinutes(numberOfSeconds) * SECONDS_IN_MINUTE);

    }
}
