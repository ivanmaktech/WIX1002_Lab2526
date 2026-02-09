package lab2;
import java.util.Scanner;

public class lab2question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the temperature in degree Fahrenheit: ");
        double fahrenheit = sc.nextDouble();

        double celsius = (fahrenheit -32)/1.8;

        System.out.printf("Temperature in degree Celsius: %.2f", celsius);
    
        sc.close();
    }
}
