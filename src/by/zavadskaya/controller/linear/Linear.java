package by.zavadskaya.controller.linear;

import by.zavadskaya.model.linear.FifthTask;
import by.zavadskaya.model.linear.FirstTask;
import by.zavadskaya.model.linear.FourthTask;
import by.zavadskaya.model.linear.SecondTask;
import by.zavadskaya.model.linear.SixthTask;
import by.zavadskaya.model.linear.ThirdTask;
import by.zavadskaya.util.Input;
import by.zavadskaya.view.Printer;

public class Linear {
    public static void main(String[] args) {

        Printer.print("Function calculation result: "
                + FirstTask.findFunctionValue(Input.input("First task.\nInput value a: "),
                Input.input("Input value b: "), Input.input("Input value c: ")));

        Printer.print("Expression calculation result: "
                + SecondTask.calculateExpression(Input.input("\nSecond task.\nInput value a: "),
                Input.input("Input value b: "), Input.input("Input value c: ")));

        Printer.print("Expression calculation result: " + ThirdTask
                .calculateExpression(Input.input("\nThird task.\nInput value x: "), Input.input("Input value y: ")));

        Printer.print(
                "Swap result: " + FourthTask.swapParts(Input.input("\nFourth task.\nInput number in the format nnn,ddd: ")));

        int numberOfSeconds = (int) Input.input("\nFifthTask.\nInput number of seconds: ");
        Printer.print("Result of second conversation: " + (int)FifthTask.countTheHours(numberOfSeconds) + " hours "
                + (int)FifthTask.countTheMinutes(numberOfSeconds) + " minutes " + (int)FifthTask.countTheSeconds(numberOfSeconds)
                + " seconds.");

        Printer.print("Result of point location check: "
                + SixthTask.pointLocationCheck(Input.input("\nSixth task.\nInput x: "), Input.input("Input y: ")));

    }
}
