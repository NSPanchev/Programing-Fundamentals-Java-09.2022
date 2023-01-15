package associativeArrays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next().replaceAll("\\s+","");

        Map<Character,Integer>symbolCount = new LinkedHashMap<>();

        for (char symbol :
                input.toCharArray()) {

            if(!symbolCount.containsKey(symbol)){

                symbolCount.put(symbol,1);

            }else{
                int currentCount = symbolCount.get(symbol);
                symbolCount.put(symbol,currentCount + 1);
            }
        }
        symbolCount.entrySet().forEach(entry -> System.out.println(entry.getKey() + "->" + entry.getValue()));
    }
}
