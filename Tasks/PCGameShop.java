package Tasks;

import java.util.Scanner;

public class PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sellGames = Integer.parseInt(scanner.nextLine());
        int hearthstone = 0;
        int fortnite = 0;
        int overWatch = 0;
        int others = 0;


        for (int i = 1; i <= sellGames ; i++) {
            String gameName = scanner.nextLine();

            switch (gameName){
                case"Hearthstone":
                    hearthstone++;

                    break;
                case"Fornite":
                    fortnite++;

                    break;
                case"Overwatch":
                    overWatch++;

                    break;
                }
            if(!gameName.equals("Hearthstone") && !gameName.equals("Fornite") && !gameName.equals("Overwatch")){
                others++;

            }
        }
        double hearthstonePercent = hearthstone* 1.0/sellGames * 100;
        double fornitePercent = fortnite* 1.0/sellGames* 100;
        double overwatchPercent = overWatch* 1.0/sellGames * 100;
        double othersPercent = others* 1.0/sellGames * 100;

        System.out.printf("Hearthstone - %.2f%%%n",hearthstonePercent);
        System.out.printf("Fornite - %.2f%%%n",fornitePercent);
        System.out.printf("Overwatch - %.2f%%%n",overwatchPercent);
        System.out.printf("Others - %.2f%%",othersPercent);
    }
}
