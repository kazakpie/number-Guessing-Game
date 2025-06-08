import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();
        boolean toPlay = true;

        game.playerInit();
        while (toPlay) {
            game.Launch();
            System.out.print("\nҚайта ойнағың келе ме (иә/жоқ)? ");
            String ans = scanner.nextLine();

            if (ans.equals("иә")){
                toPlay = true;
            }
            else {
                toPlay = false;
            }
        }
        System.out.printf("Ойыныңа рақмет, %s!", game.player.getName());
    }
}