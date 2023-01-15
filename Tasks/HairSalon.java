package Tasks;

import java.util.Scanner;

public class HairSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int goalForTheDay = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        double price = 0;

        while (!command.equals("closed"));{
                String haircut = command;
                String color = command;
                switch (haircut) {
                    case "mens":
                        price += 15;
                        break;
                    case "ladies":
                        price += 20;
                        break;
                    case "kids":
                        price += 10;
                        break;
                }
                switch ("color") {
                    case"touch up":
                        price +=20;
                        break;
                    case"full color":
                        price+=30;
                        break;
                }

        }
        if(goalForTheDay >=price){
            System.out.println(price);

        }else{
            System.out.println(goalForTheDay);
        }

    }
}
