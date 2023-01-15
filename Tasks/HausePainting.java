package Tasks;

import java.util.Scanner;

public class HausePainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double frontWall = ( 2 * (x * x)) - (1.2 * 2);
        double sideWall = ( 2 *(x * y)) - ((1.5 * 1.5) * 2);
        double top = ( 2 *(x * y)) + ((x * h / 2) * 2);
        double triangle = ((x * h / 2) * 2);

        double green = (frontWall + sideWall)/ 3.4;
        double red = top / 4.3;

        System.out.printf("%.2f%n", green);

        System.out.printf("%.2f",red);


    }
}
