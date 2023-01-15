package Tasks;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String flowerType = scanner.nextLine();
        int flowerNumber = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        double priceRoses = 5.00;
        double priceDahlias = 3.80;
        double priceTulips = 2.80;
        double priceNarcissus = 3.00;
        double priceGladiolus = 2.50;
        double price = 0;

        switch (flowerType) {
            case "Roses":
                price = flowerNumber * priceRoses;
                if (flowerNumber > 80){
                    price = price - price * 0.10;
                }
                break;
            case "Dahlias":
                price = flowerNumber * priceDahlias;
                if (flowerNumber > 90){
                    price = price - price * 0.15;
                }
                break;
            case "Tulips":
                price = flowerNumber * priceTulips;
                if (flowerNumber > 80){
                    price = price - price * 0.15;
                }
                break;
            case "Narcissus":
                price = flowerNumber * priceNarcissus;
                if (flowerNumber < 120){
                    price = price + price * 0.15;
                }
                break;
            case "Gladiolus":
                price = flowerNumber * priceGladiolus;
                if (flowerNumber < 80){
                    price = price + price * 0.20;
                }
                break;
        }

        if (price < budget) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerNumber, flowerType, budget - price);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", price - budget);
        }
    }
}

