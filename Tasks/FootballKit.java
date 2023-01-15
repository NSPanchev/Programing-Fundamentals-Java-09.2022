package Tasks;

import java.util.Scanner;

public class FootballKit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double shirtPrice = Double.parseDouble(scanner.nextLine());
        double winningPrice = Double.parseDouble(scanner.nextLine());

        double shortsPrice = shirtPrice * 0.75;
        double socksPrice = shortsPrice * 0.20;
        double shoes = (shirtPrice + shortsPrice) * 2;

        double kitPrice = shirtPrice + shortsPrice + socksPrice + shoes;
        double totalPrice = kitPrice - (kitPrice * 0.15);


        if (totalPrice >= winningPrice) {
            System.out.println("Yes, he will earn the world-cup replica ball!");
            System.out.printf("His sum is %.2f lv.", totalPrice);
        } else {
            System.out.println("No, he will not earn the world-cup replica ball.");
            System.out.printf("He needs %.2f lv. more.", winningPrice - totalPrice);

        }


    }
}
