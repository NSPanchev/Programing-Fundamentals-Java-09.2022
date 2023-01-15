package Tasks;

import java.util.Scanner;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();

        if (text.equals("sunny")) {
            System.out.print("It's warm outside!");
        }
        else{
            System.out.print("It's cold outside!");
        }

    }
}






