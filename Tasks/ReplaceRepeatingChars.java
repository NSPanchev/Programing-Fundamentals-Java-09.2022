package textProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        String rest = " ";
        char firstTime = text.charAt(0);

        rest +=firstTime;

        for (int i = 1; i < text.length() ; i++) {
            char currentSymbol = text.charAt(i);

            if(currentSymbol != firstTime){
                rest +=currentSymbol;
                firstTime = currentSymbol;
            }
        }
        System.out.println(rest);
    }
}
