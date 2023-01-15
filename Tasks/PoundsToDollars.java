package Tasks;

import java.util.Scanner;

public class PoundsToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //British Pound = 1.36 Dollars

        double pound = Double.parseDouble(scanner.nextLine());

        double dollars = pound * 1.36;

        System.out.printf("%.3f",dollars);
    }
}
