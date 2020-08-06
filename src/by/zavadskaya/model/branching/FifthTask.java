package by.zavadskaya.model.branching;

//вычислить значение функции x^2 - 3x + 9 если  x<= 3,  1/(x^3 + 6) если x > 3

public class FifthTask {

    public static double functionComputation(double x) {
        if (x > 3) {
            return 1/(Math.pow(x, 3) + 6);
        }
        else
            return Math.pow(x, 2) - 3 * x + 9;
    }
}
