package associativeArrays;

import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbersArr = Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();


        TreeMap<Double, Integer> countMap = new TreeMap<>();

        for (double num :
                numbersArr) { // обхождаме масива
            if (!countMap.containsKey(num)) { //проверявам дали имам даеното число в мапа
                countMap.put(num, 1);       // щом го нямам посочваме, че го срещаме за пръв път

            } else { // след като срещаме елемент за втори път презаписваме мапа
                // стойността остава старата + 1;


                //вземаме стойност на конкретен ключ
                int value = countMap.get(num);

                countMap.put(num, value + 1);
            }
        }
        for (Map.Entry<Double, Integer> entry : countMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}

