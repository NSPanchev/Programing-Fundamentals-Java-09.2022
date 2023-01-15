package Tasks;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        for (int number = Integer.parseInt(scanner.nextLine()); number > 0 ; number = number / 10) {
            int lastDigit = number % 10;
            sum += lastDigit;
        }
        System.out.println(sum);
    }
}
