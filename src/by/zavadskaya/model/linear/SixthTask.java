package by.zavadskaya.model.linear;

public class SixthTask {

    public static boolean pointLocationCheck(double x, double y) {
        return (x > 2 && y > 4) || (x < -2 && y > 4) || (x > 4 && y < -3) || (x < -4 && y < -3);

    }
}
