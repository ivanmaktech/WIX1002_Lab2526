package lab3;

import java.util.Scanner;
public class lab3question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = sc.nextInt();

        System.out.print("Enter b: ");
        int b = sc.nextInt();

        System.out.print("Enter c: ");
        int c = sc.nextInt();

        System.out.print("Enter d: ");
        int d = sc.nextInt();

        System.out.print("Enter e: ");
        int e = sc.nextInt();

        System.out.print("Enter f: ");
        int f = sc.nextInt();

        if (((a*d)-(b*c)) != 0){
            double x = (e*d - b*f) / (double)(a*d - b*c);
            double y = (a*f - e*c) / (double)(a*d - b*c);
            System.out.println("The solution is x = " + x + " and y = " + y);
        }
        else{
            System.out.println("The equation has no solution.");
        }
        sc.close();
    }
}
