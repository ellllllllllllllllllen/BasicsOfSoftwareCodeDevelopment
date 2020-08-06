package by.zavadskaya.controller.branching;

import by.zavadskaya.util.Input;
import by.zavadskaya.model.branching.FifthTask;
import by.zavadskaya.model.branching.FirstTask;
import by.zavadskaya.model.branching.FourthTask;
import by.zavadskaya.model.branching.SecondTask;
import by.zavadskaya.model.branching.ThirdTask;
import by.zavadskaya.view.Printer;

public class Branching {
    public static void main(String[] args) {

        int firstAngle = (int) Input.input("First task.\nInput first angle: ");
        int secondAngle = (int) Input.input("Input second angle: ");
        Printer.print("Is triangle: " + FirstTask.triangleCheck(firstAngle, secondAngle) + "\nIs right triangle: "
                + FirstTask.rightTriangleCheck(firstAngle, secondAngle));

        Printer.print("Max value: " + SecondTask.findMax(
                SecondTask.findMinInFirstPair((int) Input.input("\nSecond task.\nInput value a: "),
                        (int) Input.input("\nInput value b: ")),
                SecondTask.findMinInSecondPair((int) Input.input("\nInput value c: "),
                        (int) Input.input("\nInput value d: "))));

        Printer.print("Points check result: " + ThirdTask.pointCheck(Input.input("\nThird task.\nInput x1: "),
                Input.input("Input y1: "), Input.input("Input x2: "), Input.input("Input y2: "),
                Input.input("Input x3: "), Input.input("Input y3: ")));

        Printer.print("Result: "
                + FourthTask.conditionCheck(Input.input("\nFourth task.\nInput A: "), Input.input("Input B: "),
                Input.input("Input x: "), Input.input("Input y: "), Input.input("Input z: ")));

        Printer.print("Function computation result: " + FifthTask.functionComputation(Input.input("\nFifth task.\nInput x: ")));

    }
}
