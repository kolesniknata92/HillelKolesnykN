package Lesson5HomeWork;

public class Task3 {
    public static void main(String[] args) {

        double firstSum = internet(12);
        System.out.println("Оплата за интернет: " + firstSum);

        double secondSum = callsInUkr(700);
        System.out.println("Оплата за звонки по Украине: " + secondSum);

        double thirdSum = sms(55);
        System.out.println("Опалата за смс: " + thirdSum);

        double fourthSum = callsAbroad1(20);
        System.out.println("Оплата за звонки за рубеж зона 1: "  +fourthSum);

        double fifthSum = callsAbroad2(10);
        System.out.println("Оплата за звонки за рубеж зона 2: " + fifthSum);

        double sumWithoutTax = firstSum + secondSum + thirdSum + fourthSum + fifthSum;
        double tax = sumWithoutTax / 100 * 7;
        System.out.println("Налог на израсходованный пакет услуг: " +tax);
        double sumForPackage = sumWithoutTax + tax;

        System.out.println("Стоимость израсходованного пакета за месяц: " + sumForPackage);

    }
    public static double internet(int gb ) {
        double sumForGb;
        if (gb <= 8) {
            sumForGb = 0;
        } else {
            sumForGb = ((gb - 8.0) / 0.5) * 50.0;
        }
        return sumForGb;
    }

    static double callsInUkr (int min) {
        int min1 = 500;
        int min2 = min - min1;
        double sumForCallsInUkraine = (min1 * 0.5) + (min2 * 0.75);
        return sumForCallsInUkraine;
    }
    static double sms(int countSms){
        int sms1 = 50;
        int sms2 = countSms - sms1;
        double sumForSms = 0;
        if (sms2 != 0 ) {
            sumForSms = 2.5;
        } else {
            sumForSms = 1;
        }
        return sumForSms;

    }
    static double callsAbroad1(int abroad1) {
        double sumForCallsAbroad1 = abroad1 * 1.5;
        return sumForCallsAbroad1;
    }
    static double callsAbroad2(int abroad2){
        double sumForCallsAbroad2 = abroad2 * 2;
        return sumForCallsAbroad2;
        }

    }


