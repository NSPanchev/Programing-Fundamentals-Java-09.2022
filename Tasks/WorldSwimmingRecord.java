package Tasks;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double record = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double swimmingDistanceForMinutes = Double.parseDouble(scanner.nextLine());
        double resistance = Math.floor(distance / 15) * 12.5;
        double distanceTime = distance * swimmingDistanceForMinutes;
        double fullTime = resistance + distanceTime;

        if(record < fullTime){
            System.out.printf("No, he failed! He was %.2f seconds slower.", Math.abs(record - fullTime));
        }else{
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.",(fullTime));
        }
    }
}
