package Tasks;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chiken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegan = Integer.parseInt(scanner.nextLine());

        double chikenPrice = chiken * 10.35;
        double fishPrice = fish * 12.40;
        double veganPrice = vegan * 8.15;

        double foodPrice = chikenPrice + fishPrice + veganPrice;
        double desert = foodPrice * 20/100.00;
        double total = foodPrice + desert + 2.50;
        System.out.println(total);
    }
}
