package by.zavadskaya.model.cycles;

//Даны числовой ряд и некоорое число е. Найти сумму тех членов ряда, модуль которых больше или равен заданному е.

public class FifthTask {

    public static double findSum(double n, double e) {
        double sum = 0;
        for (double i = 0; i <= n; i++) {
            double a = Math.abs(1 / Math.pow(2, n) + 1 / Math.pow(3, n));
            if (a >= e) {
                sum += a;
            }
        }
        return sum;
    }
}
