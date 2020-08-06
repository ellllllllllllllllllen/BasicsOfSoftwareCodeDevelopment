package by.zavadskaya.model.cycles;

//напишите программу, где пользователь вводит любое целое положительноее число. А программа сумирует все числа от 1 до введенного пользователем числа

public class FirstTask {

    public static double findSum(double n) {
        double sum = 0;
        for (double i = 1; i < n; i++) {
            sum += i;
        }
        return sum;
    }
}
