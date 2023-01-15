package Tasks;

import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int page = Integer.parseInt(scanner.nextLine());
        int pageForHours = Integer.parseInt(scanner.nextLine());
        int days = Integer.parseInt(scanner.nextLine());

        int book = page / pageForHours;
        int all = book / days;

        System.out.println(all);
    }
}
