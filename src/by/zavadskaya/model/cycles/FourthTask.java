package by.zavadskaya.model.cycles;

//составить программу нахождения произведения квадратов первых двухсот чисел

public class FourthTask {

    public static double findProduct() {
        double mul = 1;
        for(double i = 1; i <= 200; i++) {
            mul *= Math.pow(i, 2);
        }
        return mul;
    }
}
