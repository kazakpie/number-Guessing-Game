import java.util.Random;
import java.util.Scanner;

public class Game {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    String ans;

    Player player = new Player();

    public void playerInit(){
        System.out.print("What is your name: ");
        player.setName(scanner.nextLine());
    }

    public void Launch() {
        int secretNum = random.nextInt(101);
        player.setScore(0);

        System.out.println("I am thinking number between 0 and 100");
        System.out.print("Can you guess the number: ");
        int playerGuess = scanner.nextInt();
        scanner.nextLine();
        player.setScore(player.getScore()+1);
        if (playerGuess == secretNum) {
            System.out.printf("\nYou got it. I guessed the number %d\n", secretNum);
            System.out.printf("It took %d attempts to you!", player.getScore());
        }
        else {
            while (playerGuess != secretNum){
                if (playerGuess > secretNum) {
                    System.out.print("I am thinking of smaller number: ");
                    playerGuess = scanner.nextInt();
                    scanner.nextLine();
                    player.setScore(player.getScore()+1);
                }else {
                    System.out.print("I am thinking of bigger number: ");
                    playerGuess = scanner.nextInt();
                    scanner.nextLine();
                    player.setScore(player.getScore()+1);
                }
            }
            System.out.printf("\nYou got it. I guessed the number %d\n", secretNum);
            System.out.printf("It took %d attempts to you!", player.getScore());
        }
        }
}
