//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        numberGuessGame Game = new numberGuessGame();
        System.out.println("********************");
        System.out.println("     Welcome to     ");
        System.out.println("Number Guessing Game");
        System.out.println("********************");
        Game.startGame();
    }
}