package Lesson3;

import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {

        System.out.println("Enter first number");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("Enter Second Number");
        int b = scanner.nextInt();

        System.out.println("Enter Third Number");
        int c = scanner.nextInt();

        int smallest = 0;
        int middle = 0;
        int greatest = 0;

        if (a >= b & b >= c) {
            greatest = a;
            middle = b;
            smallest = c;
        } else if (a >= b & c >= a) {
            smallest = b;
            middle = a;
            greatest = c;
        } else if (b >= c & c >= a){
            greatest = b;
            middle = c;
            smallest = a;
        } else if (b >= a & a >= c)
        {
            greatest = b;
            middle = a;
            smallest = c;
        } else if (c >= b & b>=a) {
            greatest = c;
            middle = b;
            smallest = a;
        } else if (a>=c & c>=b) {
            greatest = a;
            middle = c;
            smallest =b;
        }
        System.out.println("Smallest number " + smallest + " Average number " + middle + " Greatest number " + greatest);


    }
}
