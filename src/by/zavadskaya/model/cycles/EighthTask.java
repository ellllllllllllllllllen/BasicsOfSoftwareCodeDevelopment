package by.zavadskaya.model.cycles;

import by.zavadskaya.view.Printer;

public class EighthTask {

    public static void searchForIdenticalDigits(int firstNumber, int secondNumber) {

        while (firstNumber > 0) {
            int a = firstNumber % 10;
            firstNumber /= 10;
            int c = secondNumber;
            while (c > 0) {
                if(c % 10 == a) {
                    Printer.print(" " + a);
                    break;
                }
                c = c / 10;
            }
        }
    }
}
