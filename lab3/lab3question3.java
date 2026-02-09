package lab3;

import java.util.Scanner;
public class lab3question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the sales volume: ");
        double salesVolume = sc.nextDouble();

        double commission;

        if (salesVolume <= 100) {
            commission = salesVolume * 0.05;
        } else if (salesVolume <= 500) {
            commission = salesVolume * 0.075;
        } else if (salesVolume <= 1000) {
            commission = salesVolume * 0.10;
        } else {
            commission = salesVolume * 0.125;
        }

        System.out.printf("Commission: %.2f", commission);

        sc.close();
    }
}
