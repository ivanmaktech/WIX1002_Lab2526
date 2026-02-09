package lab2;

import java.util.Random;
import java.util.Scanner;

public class lab2question5 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Random g = new Random();

        int num1 = g.nextInt(10001);
        int num2 = num1;
        int sum = 0;

        while (num2 != 0){
            sum += num2 % 10;
            num2 = num2 /10;
        }

        System.out.println("The random generated number is " + num1);
        System.out.println("The sum of the digits is " + sum);
        
        sc.close();

    }
}