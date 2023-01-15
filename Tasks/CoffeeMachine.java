package Tasks;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String preference = scanner.nextLine();
        double count = Double.parseDouble(scanner.nextLine());
        double price = 0;
        double totalCount = 0;
        double priceForNumber = 0;
        double withoutPrice = 0;
        double numPrice = 0;
        double priceWithouthBiggerThanFive = 0;
        double allPrice = 0;

        //"Without", "Normal" или "Extra"

        if (drink.equals("Espresso")) {
            if (preference.equals("Without")) {
                price = (count * 0.90);
                withoutPrice = price - (price * 0.35);
                totalCount += count;
            } else if (preference.equals("Normal")) {
                price = count * 1.00;
                totalCount += count;
            } else if (preference.equals("Extra")) {
                price = count * 1.20;
                totalCount += count;
            }
            if (totalCount >= 5) {
                numPrice = price - (price * 0.25);
            }
            if (preference.equals("Without") && totalCount >= 5) {
                priceWithouthBiggerThanFive = withoutPrice - (withoutPrice * 0.25);
            }

        } else if (drink.equals("Cappuccino")) {
            if (preference.equals("Without")) {
                price = count * 1.00;
                withoutPrice = price - (price * 0.35);


            } else if (preference.equals("Normal")) {
                price = count * 1.20;


            } else if (preference.equals("Extra")) {
                price = count * 1.60;

            }

        } else if (drink.equals("Tea")) {
            if (preference.equals("Without")) {
                price = count * 0.50;
                withoutPrice = price - (price * 0.35);

            } else if (preference.equals("Normal")) {
                price = count * 0.60;

            } else if (preference.equals("Extra")) {
                price = count * 0.70;

            }
        }

        if (price > 15) {
            priceForNumber = price - (price * 0.20);
        } else if (price < 15) {
            priceForNumber = price;
            allPrice = priceForNumber + withoutPrice + numPrice;
        }
        if (preference.equals("Without") && totalCount >= 5) {
            System.out.printf("You bought %.0f cups of %s for %.2f lv.%n", count, drink, priceWithouthBiggerThanFive);
        } else {
            System.out.printf("You bought %.0f cups of %s for %.2f lv.%n", count, drink, priceForNumber);
        }
    }
}




