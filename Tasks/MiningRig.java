package Tasks;

import java.util.Scanner;

public class MiningRig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първия ред: цена на една видео карта – цяло число в интервала [1 … 2000]
        //•	На втория ред: цена на един преходник – цяло число в интервала [1 … 50]
        //•	На третия ред: цена на консумирания ток от карта за ден – реално число в интервала [0.01 ... 10.00]
        //•	На четвъртия ред: печалба от една карта за един ден – реално число в интервала [1.00 ... 100.00]

        int priceVideoCard = Integer.parseInt(scanner.nextLine());
        int pricePaste = Integer.parseInt(scanner.nextLine());
        double priceElectro = Double.parseDouble(scanner.nextLine());
        double profit = Double.parseDouble(scanner.nextLine());

        int totalPriceVideiCard = priceVideoCard * 13;
        int totalPricePaste = pricePaste * 13;
        int allPriceParts = totalPriceVideiCard + totalPricePaste + 1000;
        double expends = profit - priceElectro;
        double profitForDay = expends * 13;
        double days = allPriceParts / profitForDay;

        System.out.println(allPriceParts);
        System.out.printf("%.0f",Math.ceil(days));
    }
}
