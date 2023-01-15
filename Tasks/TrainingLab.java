package Tasks;

import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double width = Double.parseDouble(scanner.nextLine());
        Double length = Double.parseDouble(scanner.nextLine());
        Double deskRows = Math.floor((width * 100) /120);
        Double deskNumber = Math.floor(((length * 100) - 100)  / 70);
        int allDeskPlace = (int) ((deskRows * deskNumber) - 3);
        System.out.println(allDeskPlace);

    }
}
