package associativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String,Double>productsPrice = new LinkedHashMap<>();
        Map<String, Integer>productsQuantity = new LinkedHashMap<>();

        while (!input.equals("buy")){

            String[] product = input.split(" ");
            String productName = product[0];
            double price = Double.parseDouble(product[1]);
            int quantity = Integer.parseInt(product[2]);

            productsPrice.put(productName,price);

            if(!productsQuantity.containsKey(productName)) {
                productsQuantity.put(productName, quantity);
            }else{
                productsQuantity.put(productName, productsQuantity.get(productName) + quantity);

            }
            input = scanner.nextLine();
        }

    }
}
