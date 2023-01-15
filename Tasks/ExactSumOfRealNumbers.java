package Tasks;

import java.math.BigDecimal;
import java.util.Scanner;

public class ExactSumOfRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        BigDecimal sum = BigDecimal.ZERO;

        for (int i = 0; i <n ; i++) {
            BigDecimal currentNum = new BigDecimal(scanner.nextLine());
            sum = currentNum.add(sum);

        }
        System.out.println(sum);
    }
}
