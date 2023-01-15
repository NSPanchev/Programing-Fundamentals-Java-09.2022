package textProcessing;

import java.util.Scanner;

public class LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] text = input.split("\\s+");

        double sum = 0;

        for (String code :
                text) {
            double modifierNumber = getModifierNumber(code);
            sum+=modifierNumber;
        }
        System.out.printf("%.2f",sum);
    }

    private static double getModifierNumber(String code) {
        char firstLetter = code.charAt(0);
        char secondLetter = code.charAt(code.length() - 1);

        double number = Double.parseDouble(code.replace(firstLetter, ' ').replace(secondLetter, ' ').trim());

        if (Character.isUpperCase(firstLetter)) {
            int positionUpperLetter = (int) firstLetter - 64;
            number /= positionUpperLetter;
        } else {
            int positionLowerLetter = (int) firstLetter - 96;
            number *= positionLowerLetter;
        }
        if(Character.isUpperCase(secondLetter)){
            int positionUpperLetter = (int)secondLetter - 64;
            number -= positionUpperLetter;
        }else{
            int positionLowerLetter = (int)secondLetter - 96;
            number+=positionLowerLetter;
        }
        return number;
    }
}
