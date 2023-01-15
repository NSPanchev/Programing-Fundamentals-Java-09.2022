package Tasks;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());

        int videoCardsPrice = videoCards * 250;
        double processorsPrice = processors * (videoCardsPrice * 0.35);
        double ramPrice = ram * (videoCardsPrice * 0.10);
        double totalPrice = videoCardsPrice + processorsPrice + ramPrice;

        if(videoCards > processors){
            totalPrice = totalPrice - (totalPrice * 0.15);
        }
        double price = budget - totalPrice;

        if(budget > totalPrice){
            System.out.printf("You have %.2f leva left!", price);
        }else{
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(price));
        }
    }
}
