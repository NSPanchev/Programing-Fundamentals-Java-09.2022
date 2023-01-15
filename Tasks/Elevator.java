package Tasks;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Calculate how many courses will be needed to elevate n persons by using an elevator
        // with a capacity of p persons.
        //The input holds two lines: the number of people n and the capacity p of the elevator.

        int peoples = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int courses = (int)Math.ceil((double)peoples / capacity);

        System.out.println(courses);
    }
}
