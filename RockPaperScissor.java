import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            String[] rps = {"R", "P", "S"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            String playerMove;

            while (true) {
                System.out.println("please enter your move (R, P, S)");
                playerMove = sc.nextLine();
                if (playerMove.equals("R") || playerMove.equals("P") || playerMove.equals("S")) {
                    break;
                }
                System.out.println("playerMove" + "is not a valid move");
            }
            System.out.println(playerMove + "Computer played " + computerMove);
            if (playerMove.equals(computerMove)) {
                System.out.println("The game was a tie!");
            } else if (playerMove.equals("R")) {
                if (computerMove.equals("P")) {
                    System.out.println("You lose!");
                } else if (computerMove.equals("S")) {
                    System.out.println("You Win");
                }
            } else if (playerMove.equals("P")) {
                if (computerMove.equals("R")) {
                    System.out.println("You win!");
                } else if (computerMove.equals("S")) {
                    System.out.println("You lose!");
                }
            } else if (playerMove.equals("S")) {
                if (computerMove.equals("P")) {
                    System.out.println("You Win!");
                } else if (computerMove.equals("R")) {
                    System.out.println("You lose!");
                }
            }
            System.out.println("play again?(Y/N)");
            String playAgain = sc.nextLine();

            if(!playAgain.equals("Y")) {
                break;
            }
            sc.close();
            }
        }


    }
