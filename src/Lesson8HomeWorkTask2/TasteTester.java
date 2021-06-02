package Lesson8HomeWorkTask2;

public class TasteTester {
    public static void main(String[] args) {

        BirthdayCake birthdayCake = new BirthdayCake();
        System.out.println("Birthday cake has " + birthdayCake.getCandles() + " candles");
        System.out.println("Taste of birthday cake: " + birthdayCake.getTaste());
        System.out.println("Price of birthday cake: $" + birthdayCake.getPrice());

        WeddingCake weddingCake = new WeddingCake();
        System.out.println("Wedding cake has " + weddingCake.getTiers() + " tiers");
        System.out.println("Taste of wedding cake: " + weddingCake.getTaste());
        System.out.println("Price of wedding cake: $" + weddingCake.getPrice());


    }
}
