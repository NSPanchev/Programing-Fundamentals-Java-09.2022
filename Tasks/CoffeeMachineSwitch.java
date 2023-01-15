package Tasks;

import java.util.Scanner;

public class CoffeeMachineSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String preference = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());
        double price = 0;
        double withoutPrice = 0;
        double priceForNumber = 0;
        int allDrinks = 0;


        if (drink.equals("Espresso")) {
            switch (preference) {
                case "Without":
                    price = 0.90 * count;
                    withoutPrice = price - (price * 0.35);
                    allDrinks += count;
                    break;
                case "Normal":
                    price = count*1.00;
                    allDrinks += count;
                    break;
                case "Extra":
                    price = count*1.20;
                    allDrinks += count;
                    break;
            }

        } else if (drink.equals("Cappuccino")) {
            switch (preference) {
                case "Without":
                    price = 1.00;
                    withoutPrice = (count * price) - ((count * price) * 0.35);
                    allDrinks += count;
                    break;
                case "Normal":
                    price = count * 1.20;
                    allDrinks += count;
                    break;
                case "Extra":
                    price = count * 1.60;
                    allDrinks += count;
                    break;
            }

        } else if (drink.equals("Tea")) {
            switch (preference) {
                case "Without":
                    price = 0.50;
                    withoutPrice = (count * price) - ((count * price) * 0.35);
                    allDrinks += count;
                    break;
                case "Normal":
                    price = count * 0.60;
                    allDrinks += count;
                    break;
                case "Extra":
                    price = count * 0.70;
                    allDrinks += count;
                    break;
            }

        }
        if (price > 15) {
            priceForNumber = price - (price * 0.20);
        } else if (price < 15) {
            priceForNumber = price;
        }
        if (preference.equals("Without") && allDrinks >= 5) {
            withoutPrice = withoutPrice - (withoutPrice*0.25);
            System.out.printf("You bought %.0f cups of %s for %.2f lv.%n", count, drink, withoutPrice);
        } else {
            System.out.printf("You bought %.0f cups of %s for %.2f lv.%n", count, drink, priceForNumber);

        }
    }
}

