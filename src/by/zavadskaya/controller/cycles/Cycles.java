package by.zavadskaya.controller.cycles;

import by.zavadskaya.model.cycles.EighthTask;
import by.zavadskaya.model.cycles.FifthTask;
import by.zavadskaya.model.cycles.FirstTask;
import by.zavadskaya.model.cycles.FourthTask;
import by.zavadskaya.model.cycles.SecondTask;
import by.zavadskaya.model.cycles.SeventhTask;
import by.zavadskaya.model.cycles.SixthTask;
import by.zavadskaya.model.cycles.ThirdTask;
import by.zavadskaya.util.Input;
import by.zavadskaya.view.Printer;

public class Cycles {
    public static void main(String[] args) {

        Printer.print("Sum of numbers from 1 to n: " + FirstTask.findSum(Input.input("First task.\nInput n: ")));

        Printer.print("Result: " + SecondTask.calculateFunctionValue(Input.input("\nSecond task.\nInput a: "),
                Input.input("Input b: "), Input.input("Input h: ")));

        Printer.print("Sum of squares of the first hundred numbers: " + ThirdTask.findSum());

        Printer.print("Products of the squares of the first two hundred numbers: " + FourthTask.findProduct());

        Printer.print("Sum of members: " + FifthTask.findSum(Input.input("\nFifth task.\nInput number of members: "),
                Input.input("Input comparison number: ")));

        SixthTask.findMatches();

        SeventhTask.findDevider(1, 100);

        EighthTask.searchForIdenticalDigits((int)Input.input("\nEighth task.\nInput first number: "), (int)Input.input("Input second number: "));
    }
}
