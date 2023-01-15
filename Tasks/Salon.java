package Tasks;

import java.util.Scanner;

public class Salon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goal = Integer.parseInt(scanner.nextLine());
        double moneyCount = 0;
        boolean isFailed = false;

        String input = scanner.nextLine();

        while (!input.equals("closed")){
            String hairCut = input;
            if(hairCut.equals("mens")){
                moneyCount += 15;
            }else if(hairCut.equals("ladies")){
                moneyCount += 20;
            }else if(hairCut.equals("kids")){
                moneyCount += 10;
            }
            if(hairCut.equals("touch up")) {
                moneyCount += 20;
            }else if(hairCut.equals("full color")){
                moneyCount += 30;

            }
            if(goal <= moneyCount){
                isFailed = true;
                break;

            }
            input = scanner.nextLine();
        }

        if(isFailed){
            System.out.println("You have reached your target for the day!");
            System.out.printf("Earned money: %.0flv.", moneyCount );
        }else{
            System.out.printf("Target not reached! You need %.0flv. more.%n", goal - moneyCount);
            System.out.printf("Earned money: %.0flv.", moneyCount);
        }
    }
}
