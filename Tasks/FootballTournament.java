package Tasks;

import java.util.Scanner;

public class FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String teamName = scanner.nextLine();
        int games = Integer.parseInt(scanner.nextLine());
        int win = 0;
        int draw = 0;
        int loose = 0;

        for (int i = 0; i < games; i++) {
            String type = scanner.nextLine();

            switch (type){
                case"W":
                    win++;
                    break;
                case"D":
                    draw++;
                    break;
                case"L":
                    loose++;
                    break;
            }
        }

        int totalWins = win*3;
        int totalPoints = totalWins + draw;
        double percentWin=win*1.00 / games * 100;
        if(games==0) {
            System.out.printf("%s hasn't played any games during this season.", teamName);
        }else {
            System.out.printf("%s has won %d points during this season. %n", teamName, totalPoints);
            System.out.println("Total stats:");
            System.out.printf("## W: %d%n", win);
            System.out.printf("## D: %d%n", draw);
            System.out.printf("## L: %d%n", loose);
            System.out.printf("Win rate: %.2f%%", percentWin);
        }
    }
}

