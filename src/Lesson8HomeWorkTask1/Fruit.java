package Lesson8HomeWorkTask1;

public class Fruit {
    private int calories;

    public Fruit(int calories) {
        this.calories = calories;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }
    public void makeJuice(){
        System.out.println("сок сделан");
    }
}
