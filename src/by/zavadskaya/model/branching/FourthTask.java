package by.zavadskaya.model.branching;

//Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича. Определить, пройдет ли кирпич через отверстие

public class FourthTask {

    public static boolean conditionCheck(double a, double b, double x, double y, double z) {
        return (a >= x && b >= y || a >= y && b >= x || a >= x && b >= z || a >= y && b >= z || a >= z && b >= x || a >= z && b >= y);
    }
}
