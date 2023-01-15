package Tasks;

import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movie = scanner.nextLine();
        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;
        int allTickets = 0;

        while (!movie.equals("Finish")) {
            int freePlaces = Integer.parseInt(scanner.nextLine());
            int soldTickets = 0;
            String tickets = scanner.nextLine();

            while (!tickets.equals("End")) {
                soldTickets++;
                allTickets++;
                switch (tickets) {
                    case "student":
                        studentTickets++;
                        break;
                    case "standard":
                        standardTickets++;
                        break;
                    case "kid":
                        kidTickets++;
                        break;
                }
                if (soldTickets == freePlaces) {
                    break;
                }
                tickets = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movie, 1.0 * soldTickets / freePlaces * 100);
            movie = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", allTickets);
        System.out.printf("%.2f%% student tickets.%n", 1.0 * studentTickets / allTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", 1.0 * standardTickets / allTickets * 100);
        System.out.printf("%.2f%% kids tickets.%n", 1.0 * kidTickets / allTickets * 100);

    }
}
