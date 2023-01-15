package Tasks;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());

        double price = 0;

        switch (season) {
            case "Spring":
                price = 3000;
                break;
            case "Summer":
                price = 4200;
                break;
            case "Autumn":
                price = 4200;
                break;
            case "Winter":
                price = 2600;
                break;
        }
        if (fishermen <= 6) {
            price = price - (price * 0.10);
        } else if (fishermen  < 12) {
            price = price - (price * 0.15);
        } else {
            price = price - (price * 0.25);
        }
        if (!season.equals("Autumn") && fishermen % 2 == 0) {
            price = price - (price * 0.05);
        }
        if (price < budget) {
            System.out.printf("Yes! You have %.2f leva left.", budget - price);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", price - budget);
        }
    }
}
