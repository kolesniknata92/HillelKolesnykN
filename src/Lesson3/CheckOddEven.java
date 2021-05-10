package Lesson3;

import java.util.Scanner;

public class CheckOddEven {

    public static void main(String[] args) {
        System.out.println("Set number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Even Number");
        }

        else {
            System.out.println("Odd Number");

        }

        System.out.println("BYE");
    }

}

