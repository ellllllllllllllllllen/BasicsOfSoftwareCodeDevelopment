package by.zavadskaya.model.branching;
//Найти max{min(a,b), min(c,d)}

public class SecondTask {

    public static double findMinInFirstPair(double a, double b) {

        if (a > b) {
            return b;
        }
        else{
            return a;
        }
    }

    public static double findMinInSecondPair(double c, double d) {

        if (c > d) {
            return d;
        }
        else{
            return c;
        }
    }
    public static double findMax(double first, double second) {

        if (first > second) {
            return first;
        }
        else{
            return second;
        }
    }
}
