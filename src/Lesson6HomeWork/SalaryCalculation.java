package Lesson6HomeWork;

import java.util.Scanner;

public class SalaryCalculation {

    public static void main(String[] args) {
        System.out.println("Введите стаж работы");
        Scanner scanner = new Scanner(System.in);
        int experience = scanner.nextInt();


        if (experience <= 1) {

            SalesAgentSalary salesAgentSalary = new SalesAgentSalary(170, 10.0, experience);

            System.out.println("Ваш бонус за переработку: " + salesAgentSalary.sumForOvertime());
            System.out.println("Baша базовая ставка с учетом коэффициента на базовые часы: " + salesAgentSalary.experienceCoefficient());
            System.out.println("Итого Ваша заработная плата: " + salesAgentSalary.getSalary());


        }
        else {
            SalesAgentSalary salesAgentSalary1 = new SalesAgentSalary(170, 15.0, experience, 20, 15000.0);
            System.out.println("Ваш бонус за переработку: " + salesAgentSalary1.sumForOvertime());
            System.out.println("Baша базовая ставка с учетом коэффициента на базовые часы: " + salesAgentSalary1.experienceCoefficient());
            System.out.println("Ваш надбавка (штраф) за количество продаж: " + salesAgentSalary1.salesNumber());
            System.out.println("Baш бонус за сумму продаж: " + salesAgentSalary1.bonusForSales());
            System.out.println("Итого Ваша заработная плата: " + salesAgentSalary1.getSalary());

        }
    }
}

