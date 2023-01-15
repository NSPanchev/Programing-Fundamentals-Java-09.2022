package Tasks;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        double maxVolume = Double.MIN_VALUE;
        String maxModelKeg = " ";

        for (int i = 1; i <= n; i++) {
            String keg = scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());

            double volume = Math.PI*Math.pow(radius,2)*height;

            if(volume>maxVolume){
                maxVolume = volume;
                maxModelKeg = keg;
            }
        }
        System.out.println(maxModelKeg);
    }
}
