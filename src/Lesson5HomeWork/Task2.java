package Lesson5HomeWork;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Введите количество отработанных часов");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        int hoursWithoutOverTime = hours > 160 ? 160 : hours;

        System.out.println("Введите ставку");
        double rate = scanner.nextDouble();

        System.out.println("Введите стаж работы");
        int exp = scanner.nextInt();

        System.out.println("Введите количество продаж");
        int sales = scanner.nextInt();

        System.out.println("Введите сумму продаж");
        double sumOfSales = scanner.nextDouble();


        double bonus1 = sumForOvertime(hours, rate);
        System.out.println("Ваш бонус за переработку: " + bonus1);

        double bonus2 = experience(exp, rate, hoursWithoutOverTime);
        System.out.println("Baша базовая ставка с учетом коэффициента на базовые часы: " + bonus2);

        double bonus3 = salesNumber(rate, sales, hours);
        System.out.println( "Ваш надбавка (штраф) за количество продаж: " + bonus3);

        double bonus4 = bonusForSales (rate, sales, hours);
        System.out.println("Baш бонус за сумму продаж: " + bonus4);

        double total = bonus1 + bonus2 + bonus3 + bonus4;
        System.out.println("Итого Ваша заработная плата: " + total );

    }

    public static double sumForOvertime (int hours, double rate){
        double bonus1 = 0;
        if (hours > 160) {
            int difference = hours - 160;
            bonus1 = difference * (rate * 1.5);
            return bonus1;
        } else {
            return - 0;
        }
    }
    public static double experience(int exp, double rate, int hoursWithoutOvertime) {
        double bonus2 = 0;
            if (exp < 2) {
                bonus2 = rate * hoursWithoutOvertime;
            } else if ( exp < 4) {
                bonus2 = hoursWithoutOvertime * (rate * 1.2);
            } else if (exp < 6) {
                bonus2 = hoursWithoutOvertime * (rate * 1.3);
            } else {
                bonus2 = hoursWithoutOvertime * (rate * 1.4);
            }

        return bonus2;
    }
    public static double salesNumber(double rate, int sales, int hours) {
        double bonus3 = 0;
        double fine = 0;
        if (sales >= 20) {
            bonus3 = 250;
        } else if (sales < 10) {
            bonus3 = (-150.0);
        }
        return bonus3;

    }
        public static double bonusForSales( double rate, double sumOfSales, int hours){
        double bonus4 = 0;
            if (sumOfSales > 15000.0) {
                bonus4 = (rate * hours) + 200.0;
                return bonus4;
            } else {
                bonus4 = 0;
            }
            return bonus4;
        }
    }






