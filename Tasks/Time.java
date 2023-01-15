package Tasks;

import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int totalMin = hour * 60 + minutes + 15;
        int newHour = totalMin / 60;
        int newMin = totalMin % 60;
        if(newHour ==24){
            newHour = 0;
        }
        System.out.printf("%d:%02d",newHour,newMin);
    }
}
