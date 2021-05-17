package Lesson4InClass;

public class RetuntInt {
    public static void main(String[] args) {

        int x= sum(5, 7);
        System.out.println(x);

    }

    /**
     * Method for sum two values
     * @param i1
     * @param i2
     * @return
     */

    static int sum(int i1, int i2){

        int sum = i1+i2;
        return sum;
    }
}
