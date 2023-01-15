package Tasks;

import java.util.Scanner;

public class BeerAndChips {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();;
        double budget = Double.parseDouble(scanner.nextLine());
        double beerBottles = Integer.parseInt(scanner.nextLine()) * 1.20;
        int chipsPackets = Integer.parseInt(scanner.nextLine());

        double chipsPacketsPrice =  beerBottles * 0.45;
        double chipPrice = Math.ceil(chipsPacketsPrice * chipsPackets);
        double totalPrice = chipPrice + beerBottles;

        if(budget >= totalPrice){
            System.out.printf("%s bought a snack and has %.2f leva left.", name, budget - totalPrice);

        }else{
            System.out.printf("%s needs %.2f more leva!", name, totalPrice - budget);
        }
    }
}
