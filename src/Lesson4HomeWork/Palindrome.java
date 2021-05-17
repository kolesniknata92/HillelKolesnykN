package Lesson4HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Введите слово");
        Scanner scanner = new Scanner(System.in);
        String enteredWord = scanner.next();

        char[] arrayOfChars = enteredWord.toCharArray();
        int size = arrayOfChars.length;
        char[] palindrome = Arrays.copyOf(arrayOfChars, arrayOfChars.length);


        for (int i = 0; i < size / 2; i++) {
            char t = arrayOfChars[i];
            arrayOfChars[i] = arrayOfChars[size - i - 1];
            arrayOfChars[size - i - 1] = t;
        }
        System.out.println("Введенное слово справа налево:" + Arrays.toString(arrayOfChars));
        if (Arrays.equals(arrayOfChars, palindrome)) {
            System.out.println("Введенная строка является палиндромом");
        } else {
            System.out.println("Введенная строка не является палиндромом");
        }

    }
}






