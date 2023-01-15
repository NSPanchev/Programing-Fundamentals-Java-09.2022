package associativeArrays;

import java.util.*;

public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        LinkedHashMap<String, ArrayList<String>> wordsMap = new LinkedHashMap<>(); //създаваме колекция от данни, в която да съдържа думичка
        //Stringa е ключа в случая, а Arraya са синонимите, но сме казали само,  // и към нея синоним, синоним 2, зависи
        //типа данни ще ние е List от String,но самите данни ги намя            //колко ще се подадат от конзолата

        for (int i = 0; i < n; i++) { //ще направим N на брой итерации

            String word = scanner.nextLine(); // на всяка итераци имаме дума
            String synonym = scanner.nextLine();// на всяка итерация имаме и синоним

            if (!wordsMap.containsKey(word)) {            //правим проверка да ли думата я имаме
                wordsMap.put(word, new ArrayList<>());  // след като я няма, влез и ми създай ключ и нека стойността
                // е нов обект
                //понеже ги няма самите данни създаваме нов обект в паметта
                //сега имаме дума и нов обект, без нищо повече, но в него можем
                // да слагаме елементи
            }
            wordsMap.get(word).add(synonym);// чрез get достъпваме ключа, който има стойност на word
            // и след това с add добавяме синонимите
            //колкото пъти се срещне ключа, толкова пъти ще адваме нов синоним

        }
        for (Map.Entry<String, ArrayList<String>> entry : wordsMap.entrySet()) {
            System.out.printf("%s - %s%n",entry.getKey(),String.join(", ", entry.getValue()));
            
        }

    }
}
