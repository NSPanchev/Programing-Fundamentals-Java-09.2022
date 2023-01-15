package Tasks;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double clothes = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.10;
        double totalSum = 0;
        double clothesSum = statists * clothes;
        double total = 0;

        if (statists > 150) {
            clothesSum = clothesSum - (clothesSum * 0.10);

        } else if (statists < 150) {
            clothesSum = statists * clothes;
        }

        totalSum = totalSum + decor + clothesSum;
        total = total + budget - totalSum;

        if (totalSum > budget) {
            System.out.printf("Not enough money!%n" + "Wingard needs %.2f leva more.", Math.abs(total));

        } else {
            System.out.printf("Action!%n" + "Wingard starts filming with %.2f leva left.", total);
        }
    }
}
