package Tasks;

import java.util.Scanner;

public class IntegerOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        int n3 = Integer.parseInt(scanner.nextLine());
        int n4 = Integer.parseInt(scanner.nextLine());

        int add = n1 + n2;
        int devide = add / n3;
        int multy = devide * n4;

        System.out.println(multy);
    }
}
