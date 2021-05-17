package Lesson4HomeWork;

public class MinArrayValue {
    public static void main(String[] args) {

        int array[] = { 35, 24, 7, 56, 5, 13, 10, 18, 12 };
        int min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
            System.out.println("min is: " + min);

    }
}
