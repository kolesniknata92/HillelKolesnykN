package Lesson4InClass;

public class IdOddOrEven {
    public static void main(String[] args) {

        boolean isIntegerEven = isEven(10);

        System.out.println("Integer is Even " +isIntegerEven);
    }
    static boolean isEven(int input) {
        if (input % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }
}

