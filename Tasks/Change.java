package Tasks;

import java.util.Scanner;

public class Change {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoin = Integer.parseInt(scanner.nextLine());
        double chineseYuan = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine()) / 100;

        double lev = 0;

        lev += bitcoin * 1168;
        lev += (chineseYuan * 0.15) * 1.76;

        double euro = lev / 1.95;

        euro = euro - (euro * commission);

        System.out.printf("%.2f", euro);

    }
}
