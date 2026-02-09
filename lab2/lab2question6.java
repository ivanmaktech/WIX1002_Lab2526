package lab2;

import java.util.Scanner;

public class lab2question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Enter the amount of water in gram: ");
        double M = sc.nextDouble()/1000;

        System.out.print("Enter the initial temperature in Fahrenheit: ");
        double initialTemp = (sc.nextDouble()-32)*(5.0/9.0);

        System.out.print("Enter the final temperature in Fahrenheit: ");
        double finalTemp = (sc.nextDouble()-32)*(5.0/9.0);

        double Q = M*(finalTemp - initialTemp)*4184;

        System.out.printf("The energy needed is %e", Q);

        sc.close();

    }
}
