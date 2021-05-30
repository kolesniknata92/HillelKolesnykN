package Lesson6HomeWork;

public class PhoneBill {
    public static void main(String[] args) {
        MobileOperatorTariff mobileOperatorTariff = new MobileOperatorTariff(10.0, 550,
                10, 12, 100);
        System.out.println("Стоимость израсходованного пакета за месяц: " + mobileOperatorTariff.getPhoneBill());

    }
}
