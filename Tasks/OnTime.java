package Tasks;

import java.util.Scanner;

public class OnTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int examHour = Integer.parseInt(scanner.nextLine());
        int examMin = Integer.parseInt(scanner.nextLine());
        int hourOfArrival = Integer.parseInt(scanner.nextLine());
        int minuteOfsArrival = Integer.parseInt(scanner.nextLine());

        int examAllMin = examHour * 60 + examMin;
        int arriveAllMIn = hourOfArrival * 60 + minuteOfsArrival;

        int diff = Math.abs(examAllMin - arriveAllMIn);
        int diffHour = diff / 60;
        int diffMinutes = diff % 60;

        if (examAllMin< arriveAllMIn) {
            System.out.println("Late");
            if (diffHour == 0) {
                System.out.printf("%d minutes after the start", diffMinutes);
            } else {
                System.out.printf("%d:%02d hours after the start", diffHour, diffMinutes);
            }
        } else if (examAllMin == arriveAllMIn || diff <= 30) {
            System.out.println("on time");
            if (diff != 0) {
                System.out.printf("%d minutes before the start", diffMinutes);
            }
        } else {
            System.out.println("Early");
            if (diffHour == 0) {
                System.out.printf("%d minutes before the start", diffMinutes);
            } else {
                System.out.printf("%d:%02d hours before the start", diffHour, diffMinutes);
            }
        }
    }
}
