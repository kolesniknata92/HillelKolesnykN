package Lesson3;

import java.util.Scanner;

public class discount {
    public static void main(String[] args) {

        System.out.println("Enter purchase amount");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();

        if (a >= 1000) {
            double sumWithDiscount = a-(a/100*15);
            System.out.println("Total = " + sumWithDiscount + System.lineSeparator() + "You have discount - 15%");
            }
        else {
            System.out.println("There is no discount, amount of your purchase is less than 1000");
        }
    }
}
