package Lesson3;

import java.util.Scanner;

public class comparisonOfNumbers {
    public static void main(String[] args) {

        System.out.println("Enter first number");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        System.out.println("Enter second number");
        int y = scanner.nextInt();

        if (x > y) {
            System.out.println("The number " + x +  " has the greatest value");
        }

        else if (x == y) {
            System.out.println("The number " + x + " is equal to the number " + y);
        }

        else {
            System.out.println ("The number " + y + " has the greatest value");
        }

    }
}
