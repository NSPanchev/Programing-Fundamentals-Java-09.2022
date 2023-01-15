package Tasks;

import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double makerelPrice = Double.parseDouble(scanner.nextLine());
        double spratPrice = Double.parseDouble(scanner.nextLine());
        double palamud = Double.parseDouble(scanner.nextLine());
        double safrid = Double.parseDouble(scanner.nextLine());
        double mussels = Double.parseDouble(scanner.nextLine());

        double palamudPrice = (makerelPrice + makerelPrice * 0.60) * palamud;
        double safridPrice = (spratPrice + spratPrice * 0.80) * safrid;
        double musselsPrice = mussels * 7.50;

        double total = palamudPrice + safridPrice + musselsPrice;

        System.out.printf("%.2f", total);

    }
}
