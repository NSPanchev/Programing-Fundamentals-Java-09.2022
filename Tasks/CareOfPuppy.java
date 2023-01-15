package Tasks;

import java.util.Scanner;

public class CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodKg = Integer.parseInt(scanner.nextLine());
        int foodGr = foodKg * 1000;
        int eatenFood = 0;
        String input = scanner.nextLine();

        while (!input.equals("Adopted")) {
            int food = Integer.parseInt(input);

            eatenFood += food;

            input = scanner.nextLine();
        }
        int diff = Math.abs(eatenFood - foodGr);
        if (foodGr >= eatenFood) {
            System.out.printf("Food is enough! Leftovers: %d grams.", diff);
        }else{
            System.out.printf("Food is not enough. You need %d grams more.", diff);
        }
    }

}
