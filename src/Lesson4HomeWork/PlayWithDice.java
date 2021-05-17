package Lesson4HomeWork;

import java.util.Random;

public class PlayWithDice {
    public static void main(String[] args) {
        int boardDivisions = 20;


        int currentBoardDivisions = 0;
        Random random = new Random();

        for (int throwDice = 0; throwDice < 5; throwDice++) {

            int dice = random.nextInt(6) + 1;

            currentBoardDivisions = currentBoardDivisions + dice;

            System.out.println("Your " + (throwDice + 1) + " throw " + System.lineSeparator() +
                    "You are on the " + currentBoardDivisions + " paying filed " + System.lineSeparator()
                    + "You have to pass " + (boardDivisions - currentBoardDivisions) + " places");

            if (currentBoardDivisions == 20) {
                System.out.println("You are on the 20 position" + System.lineSeparator()
                        + "You win");
                break;
            } else if (currentBoardDivisions > 20) {
                System.out.println("You are on the " + currentBoardDivisions + " position" + System.lineSeparator() +
                        "You lose");
                break;
            } else if (currentBoardDivisions < 20 & throwDice == 5 ){
                System.out.println("You are on the " + currentBoardDivisions + " position" + System.lineSeparator() +
                        "You have no more throws"
                        + System.lineSeparator() + "You lose");
            }

        }
    }
}






