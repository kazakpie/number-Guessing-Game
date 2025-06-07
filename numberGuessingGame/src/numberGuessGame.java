import java.util.Scanner;
import java.util.Random;

public class numberGuessGame {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    Player player = new Player();
    int secretNumber;
    int i = 1;
    public void startGame () {

        System.out.print("What is your name: ");
        player.setName(scanner.nextLine());
        System.out.println("\nI am thinking number between 0 and 100!");
        secretNumber = random.nextInt(101);
        System.out.printf("\nCan you find the number, %s: ", player.getName());
        int userGuess = scanner.nextInt();
        scanner.nextLine();
        player.setScore(i++);

        while (userGuess != secretNumber) {
            if (secretNumber > userGuess) {
                System.out.println("Secret Number is bigger!");
                userGuess = scanner.nextInt();
                player.setScore(i++);
            }
            else {
                System.out.println("Secrete Number is smaller!");
                userGuess = scanner.nextInt();
                player.setScore(i++);
            }
        }

        System.out.println("You found it!");
        System.out.println("The secret number is " + secretNumber);
        System.out.printf("\nYou needed %d attempts", player.getScore());
    }

}
