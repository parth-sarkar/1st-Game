import java.util.*;

public class First_Game {
    public static void main(String[] args) {

        while (true) {
            System.out.println("Enter your  Move--> Rock, Paper or Scissors. If you want to Quit type quit.");
            Scanner input = new Scanner(System.in);
            String myMove = input.nextLine();

            if (myMove.equals("quit")) {
                break;
            }

            System.out.println("Your Move: " + myMove);

            if (!myMove.equals("Rock") && !myMove.equals("Paper") && !myMove.equals("Scissor")) {
                System.out.println("Invalid Input ! Please Try Again");
            } else {
                // Generating Random move from computer-->(0,1,2)
                int rand = (int) Math.random() * 3;
                String OpponentMove = "";
                if (rand == 0) {
                    OpponentMove = "Rock";
                } else if (rand == 1) {
                    OpponentMove = "Paper";
                } else {
                    OpponentMove = "Scissor";
                }
                System.out.println("Opponent Move: " + OpponentMove);

                // Main Game Moves to calculate user wins,loses or draws !
                if (myMove.equals(OpponentMove)) {
                    System.out.println("Its a Draw");
                } else if ((myMove.equals("Rock") && OpponentMove.equals("Scissor"))
                        || (myMove.equals("Paper") && OpponentMove.equals("Rock"))) {
                    System.out.println("You Win !");
                } else {
                    System.out.println("You Lose !! ");
                }
            }
        } 
        System.out.println("Thanks For Playing !");
    }
}