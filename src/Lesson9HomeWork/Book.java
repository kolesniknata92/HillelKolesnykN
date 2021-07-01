package Lesson9HomeWork;

import java.util.Objects;

public class Book {

    String title;
    double price;
    String coverType;
    int quantityOfPages;

    public Book(String title, double price, String coverType, int quantityOfPages) {
        this.title = title;
        this.price = price;
        this.coverType = coverType;
        this.quantityOfPages = quantityOfPages;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCoverType() {
        return coverType;
    }

    public void setCoverType(String coverType) {
        this.coverType = coverType;
    }

    public int getQuantityOfPages() {
        return quantityOfPages;
    }

    public void setQuantityOfPages(int quantityOfPages) {
        this.quantityOfPages = quantityOfPages;
    }
}



