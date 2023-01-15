package Tasks;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double deposit = Double.parseDouble(scanner.nextLine());
        int term = Integer.parseInt(scanner.nextLine());
        double percenst = Double.parseDouble(scanner.nextLine());

        double increase = deposit + term * ((deposit * percenst) / 100.00) / 12;
        System.out.println(increase);
    }
}
