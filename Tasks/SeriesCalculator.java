package Tasks;

import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episodes = Integer.parseInt(scanner.nextLine());
        double episodeWithoutAd = Double.parseDouble(scanner.nextLine());

        double episodeWithAd = episodeWithoutAd * 0.20;

        double totalTimeEpisodes = episodeWithoutAd + episodeWithAd;
        double seasonsSpecial = seasons * 10;

        double totalFilmTime = totalTimeEpisodes * episodes * seasons + seasonsSpecial;

        System.out.printf("Total time needed to watch the %s series is %.0f minutes.", name, Math.floor(totalFilmTime));

    }
}
