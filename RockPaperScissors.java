import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int playerScore = 0;
        int computerScore = 0;

        System.out.println("=================================");
        System.out.println("      ROCK PAPER SCISSORS");
        System.out.println("=================================");

        while (true) {

            System.out.println("\nChoose your move:");
            System.out.println("1. Rock ✊");
            System.out.println("2. Paper ✋");
            System.out.println("3. Scissors ✌️");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int playerChoice = sc.nextInt();

            if (playerChoice == 4) {
                break;
            }

            if (playerChoice < 1 || playerChoice > 3) {
                System.out.println("❌ Invalid choice! Try again.");
                continue;
            }

            int computerChoice = random.nextInt(3) + 1;

            String playerMove = getMove(playerChoice);
            String computerMove = getMove(computerChoice);

            System.out.println("\nYou chose: " + playerMove);
            System.out.println("Computer chose: " + computerMove);

            if (playerChoice == computerChoice) {
                System.out.println("🤝 It's a Draw!");
            }
            else if (
                (playerChoice == 1 && computerChoice == 3) ||
                (playerChoice == 2 && computerChoice == 1) ||
                (playerChoice == 3 && computerChoice == 2)
            ) {
                System.out.println("🔥 You Win!");
                playerScore++;
            }
            else {
                System.out.println("💀 Computer Wins!");
                computerScore++;
            }

            System.out.println("\n-----------------------------");
            System.out.println("Your Score     : " + playerScore);
            System.out.println("Computer Score : " + computerScore);
            System.out.println("-----------------------------");
        }

        System.out.println("\n=================================");
        System.out.println("          FINAL SCORE");
        System.out.println("=================================");
        System.out.println("You      : " + playerScore);
        System.out.println("Computer : " + computerScore);
        System.out.println("=================================");

        System.out.println("\nThanks for playing! 🎮");

        sc.close();
    }

    public static String getMove(int choice) {

        switch (choice) {
            case 1:
                return "Rock ✊";

            case 2:
                return "Paper ✋";

            case 3:
                return "Scissors ✌️";

            default:
                return "Unknown";
        }
    }
}
