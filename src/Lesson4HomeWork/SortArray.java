package Lesson4HomeWork;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {

        int arraySort[] = {2, 77, 33, 1, 77, 12};
        boolean sort = false;
        int s;
        while (!sort) {
            sort = true;
            for (int i = 0; i < arraySort.length - 1; i++) {
                if (arraySort[i] > arraySort[i + 1]) {
                    sort = false;

                    s = arraySort[i];
                    arraySort[i] = arraySort[i+1];
                    arraySort[i+1]= s;
                }
            }
        }
                System.out.println(Arrays.toString(arraySort));
            }
        }



