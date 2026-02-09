package lab2;

import java.util.Scanner;
public class lab2question4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter the number of seconds: ");
        int seconds = sc.nextInt();

        int hours = seconds /3600;
        int minutes = (seconds % 3600) /60;
        int sec = seconds % 60;

        System.out.print(seconds + " seconds is " + hours + " hours, " + minutes + " minutes and " + sec + " seconds");

        sc.close();
    }
}