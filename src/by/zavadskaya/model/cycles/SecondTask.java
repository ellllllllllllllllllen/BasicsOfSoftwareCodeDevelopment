package by.zavadskaya.model.cycles;

//вычислить значение функции на отрезке [a,b] с шагом h
public class SecondTask {

    public static double calculateFunctionValue(double a, double b, double h) {
        double value = 0;
        for (double x = a; x <= b; x += h) {
            if (x > 2) {
                value += x;
            } else {
                value -= x;
            }

        }
        return value;
    }
}
