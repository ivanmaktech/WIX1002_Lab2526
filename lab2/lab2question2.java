package lab2;

import java.util.Scanner;
public class lab2question2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        double P, D, R, Y, M;

        System.out.print("Please enter the price of the car (RM): ");
        P = sc.nextDouble();

        System.out.print("Please enter the down payment (RM): ");
        D = sc.nextDouble(); 

        System.out.print("Please enter the interest rate (%): ");
        R = sc.nextDouble();

        System.out.print("Please enter the loan duration (Year): ");
        Y = sc.nextDouble();

        M = (P-D)*(1+R/Y/100)/(Y*12);

        System.out.printf("The monthly payment is RM %.2f. ",M);

        sc.close();

    }
}
