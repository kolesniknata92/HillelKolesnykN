package Lesson9HomeWork;

import java.util.ArrayList;
import java.util.Objects;

public class BookTester {

    public static ArrayList<Book> bookCollection(){
        ArrayList<Book> bookCollection = new ArrayList<>();
        bookCollection.add(new Book("Азбука", 22.70, "hard", 40));
        bookCollection.add(new Book("Миссис Дэллоуэй", 106.0, "hard", 480));
        bookCollection.add(new Book("Scrum. Революционный метод управления проектами", 243, "hard", 256));
        bookCollection.add(new Book("О дивный новый мир", 123.0, "hard", 352));
        bookCollection.add(new Book("Шантарам", 152.0, "hard", 256));
        bookCollection.add(new Book("Маленький принц", 95.30, "soft", 40));
        bookCollection.add(new Book("Плутон", 68, "soft", 32));
        bookCollection.add(new Book("Волшебник Изумрудного города", 172, "hard", 256));
        bookCollection.add(new Book("Энциклопедия добрых дел: сказки для малышей", 104, "soft", 76));

        return bookCollection;
    }



    public static void main(String[] args) {

        ArrayList<Book> bookCollection = new ArrayList<>();
        bookCollection.add(new Book("Азбука", 22.70, "hard", 40));
        bookCollection.add(new Book("Миссис Дэллоуэй", 106.0, "hard", 480));
        bookCollection.add(new Book("Scrum. Революционный метод управления проектами", 243, "hard", 256));
        bookCollection.add(new Book("О дивный новый мир", 123.0, "hard", 352));
        bookCollection.add(new Book("Шантарам", 152.0, "hard", 256));
        bookCollection.add(new Book("Маленький принц", 95.30, "soft", 40));
        bookCollection.add(new Book("Плутон", 68, "soft", 32));
        bookCollection.add(new Book("Волшебник Изумрудного города", 172, "hard", 256));
        bookCollection.add(new Book("Энциклопедия добрых дел: сказки для малышей", 104, "soft", 76));
        bookCollection.add(new Book("Ты сильнее, чем ты думаешь. Гид по твоей самооценке", 297, "hard", 136));


        ArrayList<Book> booksWithSoftCover = new ArrayList<>();
        ArrayList<Book> booksWithHardCover = new ArrayList<>();

        for (int i = 0; i < bookCollection.size(); i++) {
            if (bookCollection.get(i).getCoverType().equals("soft")) {
                booksWithSoftCover.add(bookCollection.get(i));
            } else {
                booksWithHardCover.add(bookCollection.get(i));
            }
        }


        System.out.println("Все книги: ");

        bookCollection.forEach(x -> System.out.println(x.getTitle()));

        System.out.println("Книги с твердым переплетом: ");
        booksWithHardCover.forEach(x -> System.out.println(x.getTitle()));


        System.out.println("Книги с мягким переплетом: ");
        booksWithSoftCover.forEach(x -> System.out.println(x.getTitle()));

    }

}



