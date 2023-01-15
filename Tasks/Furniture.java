package regularExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        List<String>furnitureName = new ArrayList<>();

        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+[.]?\\d{2})!(?<quantity>\\d+)\\b";

        Pattern pattern = Pattern.compile(regex);

        double totalSum = 0;

        while (!text.equals("Purchase")){
            Matcher matcher = pattern.matcher(text);

            if(matcher.find()) {


                String furniture = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                furnitureName.add(furniture);

                double sum = price * quantity;
                totalSum += sum;
            }
            text = scanner.nextLine();

        }
        System.out.println("Bought furniture: ");
        furnitureName.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalSum);
    }
}
