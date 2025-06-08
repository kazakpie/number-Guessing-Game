import java.util.Random;
import java.util.Scanner;

public class Game {

    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    String ans;

    Player player = new Player();

    public void playerInit(){
        System.out.print("Есімің кім: ");
        player.setName(scanner.nextLine());
    }

    public void Launch() {
        int secretNum = random.nextInt(101);
        player.setScore(0);

        System.out.println("Мен 0 мен 100 арасындағы бір санды жасырдым!");
        System.out.printf("Мен жасырған санды таба аласың ба, %s: ", player.getName());
        int playerGuess = scanner.nextInt();
        scanner.nextLine();
        player.setScore(player.getScore()+1);
        if (playerGuess == secretNum) {
            System.out.printf("\nЖәрәйсің, %s! Мен жасырған сан %d\n", player.getName(), secretNum);
            System.out.printf("Саған бар болғаны %d мүмкіндік керек болды", player.getScore());
        }
        else {
            while (playerGuess != secretNum){
                if (playerGuess > secretNum) {
                    System.out.print("Мен кішірек сан ойлап тұрмын: ");
                    playerGuess = scanner.nextInt();
                    scanner.nextLine();
                    player.setScore(player.getScore()+1);
                }else {
                    System.out.print("Мен үлкенірек сан ойлап тұрмын: ");
                    playerGuess = scanner.nextInt();
                    scanner.nextLine();
                    player.setScore(player.getScore()+1);
                }
            }
            System.out.printf("\nЖәрәйсің, %s! Мен жасырған сан %d\n", player.getName(), secretNum);
            System.out.printf("Саған бар болғаны %d мүмкіндік керек болды", player.getScore());
        }
        }
}
