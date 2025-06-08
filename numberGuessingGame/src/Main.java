import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        boolean toPlay = true;

        game.playerInit();
        while (toPlay) {
            game.Launch();
            System.out.print("\nDo you want to play again (y or n)? ");
            String ans = scanner.nextLine();

            if (ans.equals("y")){
                toPlay = true;
            }
            else {
                toPlay = false;
            }
        }
        System.out.println("Thank you!");
    }
}