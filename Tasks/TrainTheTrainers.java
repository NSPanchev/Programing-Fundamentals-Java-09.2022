package Tasks;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jury = Integer.parseInt(scanner.nextLine());

        String input = scanner.nextLine();
        double countGrades = 0;
        double totalGrades = 0;

        while (!input.equals("Finish")) {
            String presentationName = input;
            double sumCurrentPresentationGrades = 0;

            for (int i = 1; i <= jury; i++) {
                double grade = Double.parseDouble(scanner.nextLine());
                countGrades++;

                sumCurrentPresentationGrades = sumCurrentPresentationGrades + grade;
            }

            totalGrades = sumCurrentPresentationGrades + totalGrades;

            System.out.printf("%s - %.2f.%n", presentationName, sumCurrentPresentationGrades / jury);

            input = scanner.nextLine();
        }

        System.out.printf("Student's final assessment is %.2f.", totalGrades / countGrades);
    }
}
