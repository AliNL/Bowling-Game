import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gameStatus = scanner.nextLine();
        int score = new Game(gameStatus).getScore();
        System.out.println("score = " + score);
    }
}