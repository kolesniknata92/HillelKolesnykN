package Lesson8HomeWorkTask2;

public class BirthdayCake extends Cake {
    private int candles;

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;

    }

    public BirthdayCake() {
        super("Vanilla", 77.80);
        setCandles(25);
    }

}
