package associativeArrays;

import java.util.*;

public class SoftUniParking {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, String> users = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {

            String[] info = scanner.nextLine().split(" ");

            String command = info[0];
            String name = info[1];

            switch (command) {
                case "register":
                    String plate = info[2];

                    if (!users.containsKey(name)) {
                        users.put(name, plate);
                        System.out.println(name + " registered " + plate + " successfully");
                    } else {
                        System.out.println("ERROR: already registered with plate number " + plate);

                    }
                    break;
                case "unregister":
                    if (!users.containsKey(name)) {
                        System.out.println("ERROR: user " + name + " not found");

                    } else {
                        users.remove(name);
                        System.out.println(name + " unregistered successfully");
                    }
                    break;
            }
        }
        users.forEach((name, plate) -> System.out.println(name + " => " + plate));
    }
}
