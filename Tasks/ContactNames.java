package Tasks;

import java.util.Scanner;

public class ContactNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String secondName = scanner.nextLine();
        String delimiter = scanner.nextLine();

        System.out.println(firstName + delimiter + secondName);

    }
}
