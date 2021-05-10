package Lesson3;

import java.util.Scanner;

public class salary {
    public static void main(String[] args) {
        int rate = 1000;


        System.out.println("How many sales did the manager make?");

        Scanner scanner = new Scanner(System.in);
        int sale = scanner.nextInt();

        if (sale < 10) {
            System.out.println("Your salary is" + rate );
        }
        else {
            int bonus = 250;
            int rate1 = rate + bonus;
            System.out.println("Your salary is $" + rate1);
        }
    }
}
