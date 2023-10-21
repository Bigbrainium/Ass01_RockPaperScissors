import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String player1;
        String player2;
        String choice;

        do {
            // Player 1's turn
            System.out.println("Player 1, Rock, Paper, or Scissors?");
            do {
                if (scan.hasNextLine()) {
                    player1 = scan.nextLine();
                    if (player1.equalsIgnoreCase("r")) {
                        break;
                    }
                    if (player1.equalsIgnoreCase("p")) {
                        break;
                    }
                    if (player1.equalsIgnoreCase("s")) {
                        break;
                    }
                }
                scan.nextLine();
                System.out.println("Please enter a valid input (R,P,S)");
            } while (true);

            // Player 2's turn
            System.out.println("Player 2, Rock, Paper, or Scissors?");
            do {
                if (scan.hasNextLine()) {
                    player2 = scan.nextLine();
                    if (player2.equalsIgnoreCase("r")) {
                        break;
                    }
                    if (player2.equalsIgnoreCase("p")) {
                        break;
                    }
                    if (player2.equalsIgnoreCase("s")) {
                        break;
                    }
                }
                scan.nextLine();
                System.out.println("Please enter a valid input (R,P,S)");
            } while (true);

            // Player 1 winning scenarios
            if (player1.equalsIgnoreCase("r") && player2.equalsIgnoreCase("s")) {
                System.out.println("Rock breaks scissors, Player 1 wins");
            } else if (player1.equalsIgnoreCase("p") && player2.equalsIgnoreCase("r")) {
                System.out.println("Paper covers rock, Player 1 wins");
            } else if (player1.equalsIgnoreCase("s") && player2.equalsIgnoreCase("p")) {
                System.out.println("Scissors cut paper, Player 1 wins");

            // Player 2 winning scenarios
            } else if (player1.equalsIgnoreCase("s") && player2.equalsIgnoreCase("r")) {
                System.out.println("Rock breaks scissors, Player 2 wins");
            } else if (player1.equalsIgnoreCase("r") && player2.equalsIgnoreCase("p")) {
                System.out.println("Paper covers rock, Player 2 wins");
            } else if (player1.equalsIgnoreCase("p") && player2.equalsIgnoreCase("s")) {
                System.out.println("Scissors cut paper, Player 2 wins");

            // Draw
            } else {
                System.out.println("The game was a draw");
            }

            // Check to play again
            System.out.println("Play again? [Y/N]");
            choice = scan.nextLine();
        } while (choice.equalsIgnoreCase("y"));
    }
}