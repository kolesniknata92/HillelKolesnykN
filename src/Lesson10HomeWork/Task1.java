package Lesson10HomeWork;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        double[] list1 = new double[5];

        System.out.println("Введите 5 дробных чисел");
        double Sum = 0;
        for (int i = 0; i < list1.length; i++) {
                try {
                    Scanner scanner = new Scanner(System.in);
                    double x = scanner.nextDouble();
                    list1[i] = x;
                    Sum = Sum + x;

                } catch (InputMismatchException e) {
                    i--;
                    System.out.println("Допустимы только дробные числа");
                }
            }
        System.out.println(Sum);

        }
    }




