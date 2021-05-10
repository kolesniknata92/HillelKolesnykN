package Lesson3;

import java.util.Scanner;

public class squareCircle {
    public static void main(String[] args) {

        System.out.println("Введите площадь квадрата");
        Scanner scanner = new Scanner(System.in);
        double squareArea = scanner.nextDouble();

        System.out.println("Введите площадь круга");
        double circleArea = scanner.nextDouble();

        double pi = 3.14;

        double circleDiameter = 2*Math.sqrt(circleArea/pi);
        double squareSide = Math.sqrt(squareArea);
        double squareDiagonal = squareSide*Math.sqrt(2);

        if (circleArea <= squareSide) {
            System.out.println("Круг поместится в квадрат");
        } else {
            System.out.println("Круг не поместится в квадрат");
        }

        if (circleArea >= squareDiagonal) {
            System.out.println("Квадрат поместится в круг");
        } else {
            System.out.println("Квадрат не поместится в круг");
        }
    }

}
