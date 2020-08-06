package by.zavadskaya.model.branching;

//Даны три точки A(x1,y1), B(x2,y2), C(x3,y3). Определить, будут ли они расположены на одной прямой.

public class ThirdTask {

    public static boolean pointCheck(double x1, double y1, double x2, double y2, double x3, double y3) {
        return ((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3) == 0);
    }
}
