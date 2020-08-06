package by.zavadskaya.model.linear;

public class SecondTask {

    public static double calculateExpression(double a, double b, double c) {
        return ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2);
    }
}
