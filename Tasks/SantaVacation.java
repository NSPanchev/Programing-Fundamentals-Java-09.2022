package Tasks;

import java.util.Scanner;

public class SantaVacation {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String roomType = scanner.nextLine();
        String feedback = scanner.nextLine();

        double pricePerNight = 0;
        double discount = 0;

        if (roomType.equals("room for one person")) {
            pricePerNight = 18;

        } else if (roomType.equals("apartment")) {
            pricePerNight = 25;

            if (days < 10) {
                discount = 30;

            } else if (11<=days && days <= 15) {
                discount = 35;

            } else {
                discount = 50;
            }

        } else if (roomType.equals("president apartment")) {
            pricePerNight = 35;

            if (days < 10) {
                discount = 10;

            } else if (11<=days && days <= 15) {
                discount = 15;

            } else {
                discount = 20;

            }
        }
        double totralPrice = pricePerNight * (days - 1);

        double netPrice = totralPrice - (totralPrice * discount / 100);


        if (feedback.equals("positive")) {
            netPrice = netPrice * 1.25;
        } else if (feedback.equals("negative")) {
            netPrice = netPrice * 0.9;
        }

        System.out.printf("%.2f", netPrice);
    }
}
