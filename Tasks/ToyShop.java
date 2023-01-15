package Tasks;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vacation = Double.parseDouble(scanner.nextLine());
        double puzzle = Double.parseDouble(scanner.nextLine()) ;
        double doll = Double.parseDouble(scanner.nextLine()) ;
        double bear = Double.parseDouble(scanner.nextLine()) ;
        double banana = Double.parseDouble(scanner.nextLine()) ;
        double truck = Double.parseDouble(scanner.nextLine()) ;
        double toyNumber = puzzle + doll + bear + banana + truck;
        double toyPrice = puzzle * 2.60 + doll * 3.00 + bear * 4.10 + banana * 8.20 + truck * 2.00;


        if (toyNumber >= 50) {
            toyPrice = toyPrice - (toyPrice * 0.25);
        }
        toyPrice = toyPrice - (toyPrice * 0.10);

        if(toyPrice >= vacation){
            System.out.printf("Yes ! %2f lv left.", toyPrice - vacation );
        }else{
            System.out.printf("Not enought money ! %2f lv needed.", toyPrice - vacation);
        }
    }
}
