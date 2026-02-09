package lab3;

import java.util.Scanner;
public class lab3question1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integer number: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.print("Enter the operand: ");
        char operand = sc.next().charAt(0);

        switch (operand){
            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;
            case '/':
                System.out.println(num1 + " / " + num2 +" = " + (num1 / num2));
                break;   
            case '%':
                System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                break;    
            default:
                System.out.println("Invalid operand!");
                break;
        }
        sc.close();
    }
}
