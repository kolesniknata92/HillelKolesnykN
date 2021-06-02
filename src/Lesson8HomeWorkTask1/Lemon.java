package Lesson8HomeWorkTask1;

public class Lemon extends Fruit{
    public void removeSeedLemon(){
        System.out.println("Удаляем косточки из лимона");

    }
    public Lemon(){
        super(29);
    }


    @Override
    public void makeJuice(){
        System.out.println("Готовится лимонный сок");
    }

}
