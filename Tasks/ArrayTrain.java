package Arrays;

import java.util.Scanner;

public class ArrayTrain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countWagons = Integer.parseInt(scanner.nextLine());


        int [] wagons = new int[countWagons];
        for (int wagon = 0; wagon < countWagons; wagon++) {
            int countPeople = Integer.parseInt(scanner.nextLine());
            wagons[wagon] = countPeople;
        }

        int sum = 0;
        for (int number : wagons) {

            System.out.print(number + " ");
            sum += number;
        }
        System.out.println();
        System.out.println(sum);
        //3. сумираме хората
        //System.out.println(Arrays.stream(wagons).sum());
    }
}
