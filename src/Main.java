import java.util.Random;

public class Main {
    public static void main(String args[]) {
        int result;
        System.out.println("Coin toss result");
        Random random = new Random();
        result = random.nextInt(2);
        System.out.println(result);
        if(result == 0) {
            System.out.println("Player 1 - X");
            System.out.println("Player 2 - O");
        }
        else {
            System.out.println("Player 1 - O");
            System.out.println("Player 2- X");
        }
    }
}