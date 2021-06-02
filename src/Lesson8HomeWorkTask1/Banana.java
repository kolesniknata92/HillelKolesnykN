package Lesson8HomeWorkTask1;

public class Banana extends Fruit {
    public void peelBanana() {
        System.out.println("Сейчас происходит очистка банана");

    }

    public Banana() {
        super(82);

    }

    @Override
    public void makeJuice() {
        System.out.println("Готовится банановый сок");
    }


}
