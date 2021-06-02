package Lesson8HomeWorkTask1;

public class Apple extends Fruit{
    public void removeSeeds(){
        System.out.println("Удаляем косточки из яблока");

    }

    public Apple() {
        super(52);
    }

    @Override
    public void makeJuice(){
        System.out.println("Готовится яблочный сок");
    }

    public void setCalories() {
    }
}
