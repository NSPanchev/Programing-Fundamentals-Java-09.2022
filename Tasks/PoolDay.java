package Tasks;

import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peoples = Integer.parseInt(scanner.nextLine());
        double tax = Double.parseDouble(scanner.nextLine());
        double sunBed = Double.parseDouble(scanner.nextLine());
        double umbrella = Double.parseDouble(scanner.nextLine());

        double entranceTax = peoples * tax;
        double totalSunBed = Math.ceil(peoples * 0.75) * sunBed;
        double totalUmbrella = Math.ceil(peoples * 0.50) * umbrella;

        double totalSum = entranceTax + totalSunBed + totalUmbrella;

        System.out.printf("%.2f lv.", totalSum);

    }
}
