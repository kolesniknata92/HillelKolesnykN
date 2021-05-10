package Lesson3;

import java.util.Scanner;

public class CheckPassFail {
    public static void main(String[] args) {
        System.out.println("Set mark");
        Scanner scanner = new Scanner(System.in);
        int mark = scanner.nextInt();

        if (mark >= 50) {
            System.out.println("PASS");
        }
        else {
            System.out.println("FAIL");
        }

        System.out.println("DONE");
    }

}
