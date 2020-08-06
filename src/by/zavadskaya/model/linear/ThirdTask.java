package by.zavadskaya.model.linear;

public class ThirdTask {

    public static double calculateExpression(double x, double y) {
        return (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x * y);
    }
}
