package Tasks;

import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minControl = Integer.parseInt(scanner.nextLine());
        int secControl = Integer.parseInt(scanner.nextLine());
        double gutter = Double.parseDouble(scanner.nextLine());
        int secFor100Meters = Integer.parseInt(scanner.nextLine());

        int MinInSec = minControl * 60;
        int allSec = MinInSec + secControl;

        double timeReduceInGutter = gutter / 120 * 2.5;

        double timeMarin = (gutter / 100) * secFor100Meters - timeReduceInGutter;



        if(timeMarin <= allSec){
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f.", timeMarin);
        }else{
            System.out.printf("No, Marin failed! He was %.3f second slower.", timeMarin - allSec);

        }
    }
}
