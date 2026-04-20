import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num,i;
        String ch;
        for(i=1;i<=9;i++){
            System.out.println("Select slot : ");
            num = sc.nextInt();
            sc.nextLine();
            System.out.println("Slot selected : " + num);
            ch = sc.nextLine();
            System.out.println("Character in slot selected : " + ch);
        }
    }
}