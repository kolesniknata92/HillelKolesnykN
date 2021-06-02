package Lesson8HomeWorkTask1;

public class Orange extends Fruit {
    public void cutOrange() {
        System.out.println("Разрезаем апельсин на 2 части");


    }

    public Orange() {
        super(47);
    }

    @Override
    public void makeJuice() {
        System.out.println("Готовится апельсиновый сок");
    }


}
