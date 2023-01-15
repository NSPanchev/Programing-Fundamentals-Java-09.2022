package Arrays;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int[] wagons = new int[n];

        for (int i = 0; i < n; i++) {

            int people = Integer.parseInt(scanner.nextLine());

            wagons[i] = people;
        }
        int sum = 0;
        for (int numbers : wagons) {
            System.out.print(numbers + " ");
            sum += numbers;

        }
        System.out.println();
        System.out.println(sum);


    }
}
