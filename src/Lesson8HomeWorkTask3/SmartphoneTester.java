package Lesson8HomeWorkTask3;

public class SmartphoneTester {
    public static void main(String[] args) {
        AndroidSmartphone android = new AndroidSmartphone();
        System.out.println("Техническая информация об устройстве Xiaomy:" + System.lineSeparator() +
                "Операционная система - " + android.getOS() + System.lineSeparator() +
                "Тип зарядного устройства - " + android.getCharge() + System.lineSeparator() +
                "Магазин приложений - " + android.getMarket());


        IOSSmartphone iPhone = new IOSSmartphone();
        System.out.println("Техническая информация об устройстве iPhone:" + System.lineSeparator() +
                "Операционная система - " + iPhone.getOS() + System.lineSeparator() +
                "Тип зарядного устройства - " + iPhone.getCharge() + System.lineSeparator() +
                "Магазин приложений - " + iPhone.getMarket());



    }
}
