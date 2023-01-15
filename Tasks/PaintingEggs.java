package Tasks;

import java.util.Scanner;

public class PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String eggSize = scanner.nextLine();
        String eggColour = scanner.nextLine();
        int count = Integer.parseInt(scanner.nextLine());
        double price = 0;

        if (eggSize.equals("Large")) {
            if (eggColour.equals("Red")) {
                price = 16;
            } else if (eggColour.equals("Green")) {
                price = 12;
            } else if (eggColour.equals("Yellow")) {
                price = 9;
            }

        } else if (eggSize.equals("Medium")) {
            if (eggColour.equals("Red")) {
                price = 13;
            } else if (eggColour.equals("Green")) {
                price = 9;
            } else if (eggColour.equals("Yellow")) {
                price = 7;
            }
        } else if (eggSize.equals("Small")) {
            if (eggColour.equals("Red")) {
                price = 9;

            } else if (eggColour.equals("Green")) {
                price = 8;
            } else if (eggColour.equals("Yellow")) {
                price = 5;
            }
        }
        double allPrice = count * price;
        double expense = allPrice * 0.35;
        double totalPrice = allPrice - expense;
        System.out.printf("%.2f leva.",totalPrice);
    }
}
