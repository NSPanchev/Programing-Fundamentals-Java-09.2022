package Tasks;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nylon = Integer.parseInt(scanner.nextLine());
        int paint = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int craftsman = Integer.parseInt(scanner.nextLine());
        double nylonPrice = (nylon + 2) * 1.50;
        double paintPrice = (paint + ( paint * (10 / 100.00))) * 14.50;
        double thinnerPrice = thinner * 5;
        double totalMaterial = nylonPrice + paintPrice + thinnerPrice + 0.40;
        double totalCraftsman =  ( totalMaterial * 30/100.00) * craftsman;
        double total = totalMaterial + totalCraftsman;
        System.out.println(total);

    }
}
