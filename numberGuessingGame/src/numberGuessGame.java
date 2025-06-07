import java.util.Scanner;
public class numberGuessGame {

    Scanner scanner = new Scanner(System.in);

    public void startGame () {
        System.out.println("*****************");
        System.out.println("Let's play a game");
        System.out.println("*****************");

        Player player = new Player();

        System.out.print("What is your name: ");
        player.setName(scanner.nextLine());
        System.out.printf("Welcome, %s", player.getName());

    }

}
