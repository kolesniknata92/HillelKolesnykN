package Lesson5HomeWork;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] originalArray = {7, 88, 99, 33, 22, 55, 17};
        reverse(originalArray);
    }

    public static void reverse(int[] newArray) {
        for (int i = 0; i < newArray.length / 2; i++) {
            int t = newArray[i];
            newArray[i] = newArray[newArray.length - 1 - i];
            newArray[newArray.length - 1 - i] = t;
        }
        System.out.println("Reversed Array : " + Arrays.toString(newArray));
    }
}

