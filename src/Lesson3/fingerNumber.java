package Lesson3;

import java.util.Scanner;

public class fingerNumber {
    public static void main(String[] args) {
        System.out.println("Введите номер пальца");

        Scanner scanner = new Scanner(System.in);
        int fingerNumber = scanner.nextInt();

        String fingerName = "Только 5 пальцев!";

        switch (fingerNumber) {
            case 1:
                fingerName = "Большой";
                break;
            case 2:
                fingerName = "Указательный";
                break;
            case 3:
                fingerName = "Средний";
                break;
            case 4:
                fingerName = "Безимянный";
                break;
            case 5:
                fingerName = "Мизинец";
                break;}

                System.out.println(fingerName);


        }
    }

