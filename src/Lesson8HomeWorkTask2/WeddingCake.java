package Lesson8HomeWorkTask2;

public class WeddingCake extends Cake {
    private int tiers;

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    public WeddingCake() {
        super("Chocolate", 180.20);
        setTiers(5);
    }
}
