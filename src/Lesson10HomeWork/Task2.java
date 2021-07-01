package Lesson10HomeWork;

import Lesson9HomeWork.Book;
import Lesson9HomeWork.BookTester;
import com.sun.deploy.cache.BaseLocalApplicationProperties;

import java.util.ArrayList;

public class Task2 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        books.add(BookTester.bookCollection().get(0));
        books.add(BookTester.bookCollection().get(1));
        books.add(BookTester.bookCollection().get(2));
        books.add(BookTester.bookCollection().get(3));
        books.add(BookTester.bookCollection().get(4));
        try {
            books.get(5);

        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }










    }
}
