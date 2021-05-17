package Lesson4HomeWork;

import java.util.Arrays;

public class CountArrayElements {
    public static void main(String[] args) {
        int[] elements = {12, 14, 15, 18, 13, 22, 17, 20, 27, 33, 100};
        int total = 0;

        System.out.println("Elements that contain in the Array: " + Arrays.toString(elements));

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] % 2 == 0) {
                total++;
            }
        }
        System.out.println("Count of elements that divide by 2: " + total);
    }
}
