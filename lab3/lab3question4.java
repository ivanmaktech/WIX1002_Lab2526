package lab3;

import java.util.Random;
import java.util.Scanner;
public class lab3question4 {
    public static void main(String[] args) {  
        Scanner sc = new Scanner(System.in);
        Random g = new Random();

        int player1round1 = g.nextInt(6);
        System.out.print("Player 1 rolled " + player1round1);
        int player2round1 = g.nextInt(6);
        System.out.println(", Player 2 rolled " + player2round1);
        int player1round2 = g.nextInt(6);
        System.out.print("Player 1 rolled " + player1round2);
        int player2round2 = g.nextInt(6);
        System.out.println(", Player 2 rolled " + player2round2);

        int player1total = player1round1 + player1round2;
        int player2total = player2round1 + player2round2;

        if (player1total > player2total){
            System.out.println("Player 1 wins with a total of " + player1total + " points.");
        }
        else if (player2total > player1total){
            System.out.println("Player 2 wins with a total of " + player2total + " points.");
        }
        else{
            System.out.println("It's a tie with both players scoring " + player1total + " points.");
        }
        sc.close();
    }
}
