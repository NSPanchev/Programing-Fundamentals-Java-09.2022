package Tasks;

import java.util.Scanner;

public class PastryShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String sweet = scanner.nextLine();
        int sweetNumber = Integer.parseInt(scanner.nextLine());
        int day = Integer.parseInt(scanner.nextLine());
        double price = 0;
        double total = 0;

        if (day == 16 && day < 22) {
            switch (sweet) {
                case "Cake":
                    price = sweetNumber * 28.70;
                    break;
                case "Souffle":
                    price = sweetNumber * 9.80;
                    break;
                case "Baklava":
                    price = sweetNumber * 16.98;
                    break;
            }
            if (100 <= price && price <= 200) {
                price = price - (price * 0.15);
            } else if (price > 200) {
                price = price - (price * 0.25);

            }
        } else if (day <= 15) {
            switch (sweet) {
                case "Cake":
                    price = sweetNumber * 24.00;
                    break;
                case "Souffle":
                    price = sweetNumber * 6.66;
                    break;
                case "Baklava":
                    price = sweetNumber * 12.60;
                    break;
            }
            if (100 <= price && price <= 200) {
                price = price - (price * 0.15);
            } else if (price > 200) {
                price = price - (price * 0.25);
            }
            total = price - (price * 0.10);

        } else if ( 22 < day && day < 25) {
            switch (sweet) {
                case "Cake":
                    price = sweetNumber * 28.70;
                    break;
                case "Souffle":
                    price = sweetNumber * 9.80;
                    break;
                case "Baklava":
                    price = sweetNumber * 16.98;
                    break;
            }total = price ;
        }else if(sweetNumber > 10000){
            price = 0;
        }
            System.out.printf("%.2f",total);
    }
}