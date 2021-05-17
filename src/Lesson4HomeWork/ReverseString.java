package Lesson4HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("Ведите слово");
        Scanner scanner = new Scanner(System.in);
        String reverse = scanner.next();


        char[] reverseString = reverse.toCharArray();


        for (int i = reverseString.length - 1; i >= 0; i--) {
            System.out.print(reverseString[i]);

        }
    }
}

