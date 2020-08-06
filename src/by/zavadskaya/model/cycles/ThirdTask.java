package by.zavadskaya.model.cycles;

//найти сумму квадратов первых 100 чисел

public class ThirdTask {

    public static double findSum() {
        double sum = 0;
        for(double i = 0; i <= 100; i++) {
            sum += Math.pow(i, 2);
        }
        return sum;
    }
}
