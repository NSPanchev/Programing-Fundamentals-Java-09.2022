package Tasks;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double excursionPrice = Double.parseDouble(scanner.nextLine());
        double moneyOnHand = Double.parseDouble(scanner.nextLine());
        int spendDaysCount = 0;
        int allDays = 0;
        boolean isFailed = false;

        while (moneyOnHand < excursionPrice){
            String action = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());
            allDays ++;
            switch (action){
                case "spend":
                    spendDaysCount++;
                    moneyOnHand -= sum;
                    if (moneyOnHand < 0) {
                        moneyOnHand = 0;
                    }
                    break;
                case "save":
                    spendDaysCount = 0;
                    moneyOnHand += sum;
                    break;
            }
            if(spendDaysCount ==5){
                isFailed = true;
                break;
            }
        }
        if(isFailed){
            System.out.printf("You can't save the money.%n%d", allDays);
        }else{
            System.out.printf("You save the money for %d days",allDays);
        }

    }
}
