package Tasks;

import java.util.Scanner;

public class VegetableMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double vegetablesPrice = Double.parseDouble(scanner.nextLine());
        double fruitsPrice = Double.parseDouble(scanner.nextLine());
        double vegetables = Double.parseDouble(scanner.nextLine());
        double fruits = Double.parseDouble(scanner.nextLine());

        double totalV = vegetablesPrice * vegetables;
        double totalF = fruitsPrice * fruits;

        double total = (totalF + totalV) / 1.94;

        System.out.printf("%.2f", total);


    }
}
