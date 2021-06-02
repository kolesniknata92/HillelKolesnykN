package Lesson8HomeWorkTask1;

public class JuiceMarket {
    public static void main(String[] args) {

        Apple apple = new Apple();
        System.out.println("Каллорий в яблоке - " + apple.getCalories());
        apple.removeSeeds();
        apple.makeJuice();

        Banana banana = new Banana();
        System.out.println("Каллорий в банане - " + banana.getCalories());
        banana.peelBanana();
        banana.makeJuice();

        Lemon lemon = new Lemon();
        System.out.println("Калорий в лимоне - " + lemon.getCalories());
        lemon.removeSeedLemon();
        lemon.makeJuice();

        Orange orange = new Orange();
        System.out.println("Калорий в апельсине - " + orange.getCalories());
        orange.cutOrange();
        orange.makeJuice();


    }

}


