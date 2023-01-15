package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] first = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] second = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;
        int diffIndex = 0;
        boolean isTrue = true;


        for (int i = 0; i < first.length; i++) {

            int firstNum = first[i];
            int secondNum = second[i];

            if (firstNum == secondNum) {
                sum += firstNum;

            } else {

                diffIndex = i;
                isTrue = false;

                break;

            }
        }
        if (isTrue) {
            System.out.printf("Arrays are identical. Sum: %d", sum);

        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", diffIndex);

        }

    }
}
