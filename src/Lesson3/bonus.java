package Lesson3;

import java.util.Scanner;

public class bonus {
    public static void main(String[] args) {
                int rate = 1000;

                System.out.println("How many sales did the manager make?");

                Scanner scanner = new Scanner(System.in);
                int sale = scanner.nextInt();

                if (sale < 10) {
                    int needSales = 10 - sale;
                    System.out.println("You need to make " + needSales + " sales to get the bonus" );
                }
                else {
                    int bonus = 250;
                    int rate1 = rate + bonus;
                    System.out.println("Your bonus is $" + bonus + System.lineSeparator() + "Your salary is $" + rate1);
                }
            }
        }
