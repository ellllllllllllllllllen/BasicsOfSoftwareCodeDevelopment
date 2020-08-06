package by.zavadskaya.model.branching;

//Даны два угла треугольника(в градусах). Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.

public class FirstTask {

    public static final int RIGHT_ANGLE = 90;
    public static final int SUM_OF_ANGLES = 180;

    public static boolean triangleCheck(int firstAngle, int secondAngle) {
        return (firstAngle > 0 && secondAngle > 0 && firstAngle + secondAngle < SUM_OF_ANGLES);
    }

    public static boolean rightTriangleCheck(int firstAngle, int secondAngle) {
        return FirstTask.triangleCheck(firstAngle, secondAngle)
                && (firstAngle == RIGHT_ANGLE || secondAngle == RIGHT_ANGLE || firstAngle + secondAngle == RIGHT_ANGLE);
    }
}
