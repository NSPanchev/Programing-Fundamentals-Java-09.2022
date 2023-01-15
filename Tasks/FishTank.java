package Tasks;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double volume = lenght * width * high;
        double water = volume / 1000 ;
        double busy = (percent / 100);
        double allNeeded = water * ( 1 - busy);
        System.out.println(allNeeded);

    }
}
