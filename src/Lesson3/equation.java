package Lesson3;

import java.util.Scanner;

public class equation {
    public static void main(String[] args) {

        System.out.println("x = - b/a");

        System.out.println("Enter 'a' number");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();

        double c = 0;

       if (a == 0) {
            System.out.println("You cannot divide by zero");}

        else if (a > 0) {
           System.out.println("Enter 'b' number");
            double b = scanner.nextDouble();
            double x = - b/a;
            System.out.println("x = " + x);
            double с = (int) (a * x + b);

            System.out.println( "a*x + b = 0" + System.lineSeparator() + a + " * " + x + " + " + b + " = " + c);
        }


    }
}
