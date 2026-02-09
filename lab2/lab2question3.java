package lab2;

import java.util.Random;
import java.util.Scanner;
public class lab2question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random g = new Random();

        int num1 = g.nextInt(41)+10;
        int num2 = g.nextInt(41)+10;
        int num3 = g.nextInt(41)+10;
        
        int sum = num1 + num3 + num3;
        double average = sum / 3.0;

        System.out.println("Randomly generate numbers are " + num1 + ", " + num2 + " and " + num3);
        System.out.println("The sum is " + sum);
        System.out.printf("The average is %.2f ", average);

        sc.close();

    }
}
