package regularExpression;

import java.io.LineNumberInputStream;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String namesParticipants = scanner.nextLine(); //"George, Peter, Bill, Tom"
        List<String> names = Arrays.stream(namesParticipants.split(", ")).collect(Collectors.toList());

        Map<String, Integer> racerDistances = new LinkedHashMap<>();
        names.forEach(name -> racerDistances.put(name, 0));


        String regexLetters = "[A-Za-z]+";
        Pattern patternLetters = Pattern.compile(regexLetters);

        String regexDigits = "[0-9]";
        Pattern patterDigits = Pattern.compile(regexDigits);

        String input = scanner.nextLine();
        while (!input.equals("end of race")) {

            StringBuilder racerName = new StringBuilder();
            Matcher matcherLetters = patternLetters.matcher(input);


            while (matcherLetters.find()) {
                racerName.append(matcherLetters.group());
            }


            int distance = 0;
            Matcher matcherDigits = patterDigits.matcher(input);

            while (matcherDigits.find()) {
                distance += Integer.parseInt(matcherDigits.group());
            }

            if (names.contains(racerName.toString())) {

                int currentDistance = racerDistances.get(racerName.toString());
                racerDistances.put(racerName.toString(), currentDistance + distance);
            }

            input = scanner.nextLine();
        }
        int count = 1;

        for (Map.Entry<String, Integer> pair :
                racerDistances.entrySet()) {
            if (count == 1) {

                System.out.println("1st place: " + pair.getKey());
                count++;
            } else if (count == 2) {
                //втория играч
                System.out.println("2nd place: " + pair.getKey());
                count++;
            } else if (count == 3) {
                //третия играч
                System.out.println("3rd place: " + pair.getKey());
                break;
            }
        }
    }
}

