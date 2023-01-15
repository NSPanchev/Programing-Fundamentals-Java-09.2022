package Tasks;

import java.util.Scanner;

public class ComputerFirm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int computerNumber = Integer.parseInt(scanner.nextLine());

            //Тези променливи ги правим от тип double, тъй като накрая се очаква да върнем резултата закръглен
            //до втория знак след десетичната точка.
            double salesCount = 0;
            double ratingCount = 0;

            for (int i = 0; i < computerNumber; i++) {
                //Според условието ratingSale ще ни бъде цяло число, затова тук сменяме типа от double на int.
                int ratingSale = Integer.parseInt(scanner.nextLine());

                //Добра идея е за да се опазим от грешки тук е да запишем резултата в променливи от тип int,  в противен случай,
                //както предполагам забелязахте на втория тест има известно разминаване в резултата, а причината е, че при операцията
                //ratingSale / 10 ще получим число с плаваща точка и съответно дробна част, а ние искаме да вземем само стойността без
                //дробната част.
                int rating = ratingSale % 10;
                int possibleSales = ratingSale / 10;

                //Ако премахнем проверката за rating == 2 тази променлива на всяко едно завъртане следва да я нулираме, тъй като
                //при определени ситуации може да пази стойност от иминала итерация и това да ни размие очаквания резултат.
                double salesMade = 0;

                if (rating == 3) {
                    salesMade = possibleSales * 0.50;
                } else if (rating == 4) {
                    salesMade = possibleSales * 0.70;
                } else if (rating == 5) {
                    salesMade = possibleSales * 0.85;
                } else if (rating == 6) {
                    salesMade = possibleSales;
                }

                salesCount += salesMade;
                ratingCount += rating;

            }
            double averageRating = ratingCount / computerNumber;

            //При принтирането използваме %.2f за да закръглим стойностите до втория знак след десетичната точка.
            System.out.printf("%.2f", salesCount);
            System.out.println();
            System.out.printf("%.2f", averageRating);

        }
    }
