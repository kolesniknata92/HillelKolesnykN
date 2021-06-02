package Lesson8HomeWorkTask2;

public class Cake {
    private String taste;
    private double price;

    public Cake(String taste, double price) {
        this.taste = taste;
        this.price = price;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
