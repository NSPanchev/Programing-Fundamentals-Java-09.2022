package Tasks;

import java.util.Scanner;

public class FamilyTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double nightsPrice = Double.parseDouble(scanner.nextLine()) * nights;
        double percent = Double.parseDouble(scanner.nextLine()) / 100;

        double percentExtras = budget * percent;

        if(nights > 7){
            nightsPrice = nightsPrice - (nightsPrice * 0.05);
        }
        double totalSum = nightsPrice + percentExtras;
        if(budget >= totalSum){
            System.out.printf("Ivanovi will be left with %.2f leva after vacation.", budget - totalSum);
        }else{
            System.out.printf("%.2f leva needed.", totalSum - budget);
        }
    }
}
