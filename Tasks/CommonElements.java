package Arrays;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] first = scanner.nextLine().split(" ");
        String [] second = scanner.nextLine().split(" ");

        for (String elementSecond :
                second) {
            for (String elementFirst :
                    first) {
                if(elementSecond.equals(elementFirst)){
                    System.out.print(elementFirst + " ");
                    break;
                }
            }
        }
    }
}
