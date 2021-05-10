package Lesson3;

import java.util.Scanner;

public class interval {
    public static void main(String[] args) {

        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        int rangeNumber = scanner.nextInt();

        if (3 >= rangeNumber & rangeNumber >= -5 ) {
        System.out.println("Введенное число " + rangeNumber + " принадлежит заданному интервалу");}

        else {
            System.out.println("Введенное число " + rangeNumber +  " НЕ принадлежит заданному интервалу");
        }
    }
}
