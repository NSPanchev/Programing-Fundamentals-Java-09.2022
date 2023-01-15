package Tasks;

import java.util.Scanner;

public class TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String townName = scanner.nextLine();
        String pack = scanner.nextLine();
        String vip = scanner.nextLine();
        int daysToStay = Integer.parseInt(scanner.nextLine());
        double price = 0;


        if (townName.equals("Borovets") || townName.equals("Bansko")) {
            if (pack.equals("noEquipment")) {
                price = 80;
                switch (vip) {
                    case "yes":
                        price = (price - (price * 0.05)) * daysToStay;
                        break;
                    case "no":
                        price = price * daysToStay;
                        break;
                }
            } else if (pack.equals("withEquipment")) {
                price = 100;
                switch (vip) {
                    case "yes":
                        price = (price - (price * 0.10)) * daysToStay;
                        break;
                    case "no":
                        price = price * daysToStay;
                        break;
                }
            }
            if (daysToStay < 1) {
                System.out.println("Days must be positive number!");
            }else {
                System.out.printf("The price is %.2flv! Have a nice time!", price);
            }
        } else if (townName.equals("Varna") || townName.equals("Burgas")) {
            if (pack.equals("noBreakfast")) {
                price = 100;
                switch (vip) {
                    case "yes":
                        price = (price - (price * 0.07)) * daysToStay;
                        break;
                    case "no":
                        price = price * daysToStay;
                        break;
                }
            } else if (pack.equals("withBreakfast")) {
                price = 130;
                switch (vip) {
                    case "yes":
                        price = (price - (price * 0.12)) * daysToStay;
                        break;
                    case "no":
                        price = price * daysToStay;
                        break;
                }
            }
            if (daysToStay < 1) {
                System.out.println("Days must be positive number!");
            }else {
                System.out.printf("The price is %.2flv! Have a nice time!", price);
            }
        }
        if (!townName.equals("Borovets") && !townName.equals("Bansko") && !townName.equals("Varna") && !townName.equals("Burgas")) {
            System.out.println("Invalid input!");
        }
    }
}
