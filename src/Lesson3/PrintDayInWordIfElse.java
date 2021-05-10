package Lesson3;

import java.util.Scanner;

public class PrintDayInWordIfElse {
    public static void main(String[] args) {
        System.out.println("Enter day number");

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        String dayInWord = "Not a valid day";

        if (day == 1) {
            dayInWord = "Sunday";
        }

        else if (day == 2) {
            dayInWord = "Monday";
        }

        else if (day == 3) {
            dayInWord = "Tuesday";
        }
        else if (day == 4) {
            dayInWord = "Wednesday";
        }

        else if (day == 5) {
            dayInWord = "Thursday";
        }

        else if (day == 6) {
            dayInWord = "Friday";
        }

        else if (day == 7) {
            dayInWord = "Saturday";

        }

        System.out.println("Current day is " + dayInWord);


    }
}
