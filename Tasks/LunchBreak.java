package Tasks;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int episode = Integer.parseInt(scanner.nextLine());
        int rest = Integer.parseInt(scanner.nextLine());

        double lunch = rest * 0.125;
        double relaxation = rest * 0.25;

        double allRelax = episode + lunch + relaxation;
        double timeLeft = Math.abs(rest - allRelax);

        if(rest >= allRelax){
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", movie, Math.ceil(timeLeft));
        }else{
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", movie, Math.ceil(timeLeft));
        }
    }
}
