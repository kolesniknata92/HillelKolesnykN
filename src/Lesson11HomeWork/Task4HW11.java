package Lesson11HomeWork;

public class Task4HW11 {
    public static void main(String[] args) {

        String lastWord = "Reflection";
        String secondWord = (lastWord.substring(lastWord.length() - 1));
        String newWord = secondWord + lastWord;
        System.out.println(newWord);

    }
}
