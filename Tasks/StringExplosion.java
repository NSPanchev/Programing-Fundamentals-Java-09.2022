package textProcessing;

import java.util.Scanner;

public class StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        StringBuilder builder = new StringBuilder(text);
        int power = 0;

        for (int position = 0; position <= builder.length()-1; position++) {
            char currentSymbol = builder.charAt(position);

            if(currentSymbol == '>'){
            int explosionStrength = Integer.parseInt(builder.charAt(position+1)+"");
            power += explosionStrength;

            }else if(currentSymbol != '>' && power > 0){
                builder.deleteCharAt(position);
                power--;
                position--;
            }
        }
        System.out.println(builder);
    }
}
