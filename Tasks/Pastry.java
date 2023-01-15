package Tasks;

import java.util.Scanner;

public class Pastry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String cakeType = scanner.nextLine();
        int purchasedCakes = Integer.parseInt(scanner.nextLine());
        int day = Integer.parseInt(scanner.nextLine());

        double totalSum = 0;

        if (day <= 15) {
            switch (cakeType) {
                case "Cake":
                    totalSum = purchasedCakes * 24;
                    break;
                case "Souffle":
                    totalSum = purchasedCakes * 6.66;
                    break;
                case "Baklava":
                    totalSum = purchasedCakes * 12.60;
                    break;
            }
        } else {
            switch (cakeType) {
                case "Cake":
                    totalSum = purchasedCakes * 28.70;
                    break;
                case "Souffle":
                    totalSum = purchasedCakes * 9.80;
                    break;
                case "Baklava":
                    totalSum = purchasedCakes * 16.98;
                    break;
            }
        }

        if (day <= 22) {
            if (totalSum >= 100 && totalSum <= 200) {
                totalSum -= totalSum * 0.15;
            } else if (totalSum > 200) {
                totalSum -= totalSum * 0.25;
            }
        }
        if (day <= 15) {
            totalSum -= totalSum * 0.10;
        }
        System.out.printf("%.2f", totalSum);

    }
}


