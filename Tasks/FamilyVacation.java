package Tasks;

import java.util.Scanner;

public class FamilyVacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double nightsPrice = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double totalNightsPrice = 0;
        double allExtras = budget * extras / 100;

        if (nights > 7) {
            nightsPrice = nightsPrice - (nightsPrice * 0.05);
            totalNightsPrice = nights * nightsPrice;

        } else {
            totalNightsPrice = nights * nightsPrice;
        }
        double allSpends = totalNightsPrice + allExtras;
        if (budget >= allSpends) {
            System.out.printf("Ivanovi will be left with %.2f leva after vacation", budget - allSpends);
        } else {
            System.out.printf("%.2f leva needed.", allSpends - budget);
        }
        System.out.println(nightsPrice);
        System.out.println(allSpends);
        System.out.println(allExtras);
    }
}

