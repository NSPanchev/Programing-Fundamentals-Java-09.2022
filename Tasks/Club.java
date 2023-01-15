package Tasks;

import java.util.Scanner;

public class Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wantedSum = Integer.parseInt(scanner.nextLine());
        String cocktailName = scanner.nextLine();
        double price = 0;
        double money = 0;


        while (!cocktailName.equals("Party!")) {
            int cocktailNumber = Integer.parseInt(scanner.nextLine());
            int length = cocktailName.length();
            price = cocktailNumber * length;


            if (price % 2 != 0) {
                price = price - (price * 0.25);
            }
            money += price;
            if (money >= wantedSum) {
                System.out.println("Target acquired.");
                break;
            }
            cocktailName = scanner.nextLine();
        }
        if(cocktailName.equals("Party!")){
            double diff = wantedSum - money;
            System.out.printf("We need %.2f leva more.%n", diff);
        }

        System.out.printf("Club income - %.2f leva.", money);

    }
}
