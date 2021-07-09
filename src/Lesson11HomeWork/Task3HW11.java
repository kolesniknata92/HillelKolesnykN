package Lesson11HomeWork;

public class Task3HW11 {
    public static void main(String[] args) {

        String repeatString = "Sunrise";

        if (repeatString.length() >= 3) {
            String repeated = new String(new char[3]).replace("\0", repeatString);
            System.out.println(repeated);
        } else {
            System.out.println(repeatString);
        }
    }

}
