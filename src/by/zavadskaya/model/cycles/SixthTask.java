package by.zavadskaya.model.cycles;

import by.zavadskaya.view.Printer;

//вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера

public class SixthTask {

    public static void findMatches() {

        for (int i = -128; i <= 127; i++) {
            Printer.print("\n" + i + " - " + (char)i);
        }


    }
}
