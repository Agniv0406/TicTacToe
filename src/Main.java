import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int num,i,row,column;
        System.out.println("Enter slot : ");
        num = sc.nextInt();
        row = ((num-1)/3);
        column = (num%3);
        if(column==0){
            column = 3;
        }
        System.out.println("Row : " + row);
        System.out.println("Column : " + column);
    }
}