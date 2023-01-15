package Tasks;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int basketballtax = Integer.parseInt(scanner.nextLine());
        double snikers = basketballtax - (basketballtax * 40 / 100);
        double outfit = snikers - (snikers * 20 / 100);
        double ball =  (outfit * 25 / 100);
        double accessary =  (ball * 20 / 100);
        double total = basketballtax + snikers + outfit + ball + accessary;

        System.out.println(total);
    }
}
