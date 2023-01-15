package Tasks;

import java.util.Scanner;

public class CatDiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double fats = Double.parseDouble(scanner.nextLine());
        double proteins = Double.parseDouble(scanner.nextLine());
        double carbohydrate = Double.parseDouble(scanner.nextLine());
        double cal = Double.parseDouble(scanner.nextLine());
        double watter = Double.parseDouble(scanner.nextLine());

        double totalFats = ((cal*(fats/100))) / 9;
        double totalProtein = ((cal*(proteins/100))) / 4;
        double totalCarbohydrate = ((cal*(carbohydrate/100))) / 4;
        double totalFood = totalFats + totalProtein + totalCarbohydrate;
        double calIn1GramFood = cal / totalFood;

        double waterIn = 100 - watter;
        double procentWater = waterIn / 100;
        double total = calIn1GramFood * procentWater;


        System.out.printf("%.4f",total);



    }
}
