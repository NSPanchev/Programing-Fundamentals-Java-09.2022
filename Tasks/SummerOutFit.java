package Tasks;

import java.util.Scanner;

public class SummerOutFit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int degrees = Integer.parseInt(scanner.nextLine());
        String time = scanner.nextLine();

        String outfit = "";
        String shoes = "";

        if (10 <= degrees && degrees <= 18) {
            switch (time) {
                case "Мorning":
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                    break;
                case "Afternoon":
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasin";
                    break;
            }
        } else if (18 < degrees && degrees <= 24) {
            switch (time) {
                case "Мorning":
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
                case "Afternoon":
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                    break;
            }
        }else{
            switch (time) {
                case "Мorning":
                    outfit = "T-Shirt";
                    shoes = "Sandal";
                    break;
                case "Afternoon":
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                    break;
                case "Evening":
                    outfit = "Shirt";
                    shoes = "Moccasins";
                    break;
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }
}
