package by.zavadskaya.model.cycles;

import by.zavadskaya.view.Printer;

//для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа . m и n ввод¤тс¤ с клавиатуры

public class SeventhTask {

    public static void findDevider(double m, double n) {
        for (double i = m; i <= n; i++) {
            for(double j = 2; j < i; j++) {
                if(i % j == 0) {
                    Printer.print("\nƒелитель числа "+ i + " - " + j);
                }
            }
        }
    }
}
