package Tasks;

import java.util.Scanner;

public class TeamBuilding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peoples = Integer.parseInt(scanner.nextLine());
        double entranceTax = Double.parseDouble(scanner.nextLine());
        double sunLoungerPrice = Double.parseDouble(scanner.nextLine());
        double umbrellaPrice = Double.parseDouble(scanner.nextLine());

        double allEntranceTax = peoples * entranceTax;
        double allSunLounger = Math.ceil( peoples * 0.75) * sunLoungerPrice;
        double allUmbrella =  Math.ceil(peoples * 0.50) * umbrellaPrice;

        double total = allEntranceTax + allUmbrella + allSunLounger;

        System.out.println(allEntranceTax);
        System.out.println(allSunLounger);
        System.out.println(allUmbrella);

        System.out.printf("%.2f", total);

    }
}


