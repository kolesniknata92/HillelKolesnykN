package Lesson4HomeWork;

import java.util.Arrays;

public class FlipArray {
    public static void main(String[] args) {
        int[] originalArray = {77, 12, 66, 55, 13, 55, 12, 55};

        System.out.println("Array before reverse: " + Arrays.toString(originalArray));

        for (int i = 0; i< originalArray.length/2;  i++) {
            int g = originalArray[i];
            originalArray[i] = originalArray[originalArray.length - i - 1];
            originalArray[originalArray.length - i - 1] = g;
        }

            System.out.println("Array after reverse: " + Arrays.toString(originalArray));
        }
    }



