package Lesson3;

import java.util.Scanner;

public class mortgage {
    public static void main(String[] args) {
        System.out.println("Set wife's age");
        Scanner scanner = new Scanner(System.in);
        int wifeAge = scanner.nextInt();

        System.out.println("Set husband's age");
        Scanner scanner1 = new Scanner(System.in);
        int husbandAge = scanner.nextInt();

        if (22 <= wifeAge & wifeAge <= 27) {
            if (husbandAge >= 30 & husbandAge <= 50) {
                System.out.println("True");
            }
            else System.out.println("False");
        }
        else {
            System.out.println("False");
        }
    }
}





