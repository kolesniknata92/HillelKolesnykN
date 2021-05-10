package Lesson3;

import java.util.Scanner;

public class numberDivisor {
    public static void main(String[] args) {

        System.out.println("Set number a");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        System.out.println("Set number b");
        int b = scanner.nextInt();

        if (b % a == 0) {
            System.out.println("a является делителем числа b");
        } else {
            System.out.println("a не является делителем числа b");
        }
    }
}
