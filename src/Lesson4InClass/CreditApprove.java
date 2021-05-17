package Lesson4InClass;

import java.util.Scanner;

public class CreditApprove {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("");

    }
    static boolean isApproveBySalary(double salary) {
        System.out.println("You Salary id " +salary);
        return salary > 20000.0;
    }
    static boolean isApproveByCreditRating( int rate) {
        System.out.println("Your credit rating is " +rate );
        return rate > 70;
    }
    static boolean isApproveByWorkYears( int workYears) {
        System.out.println("Your work years is" + workYears);
        return workYears > 2;

    }

    static boolean isExistsCredit(boolean isCreditAlreadyExist){
        System.out.println("Your Credit is " + isCreditAlreadyExist);
        return isCreditAlreadyExist;
    }

}
