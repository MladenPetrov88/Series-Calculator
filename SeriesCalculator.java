import java.util.Scanner;

public class SeriesCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String serialName = scan.nextLine();
        int seasonsCount = Integer.parseInt(scan.nextLine());
        int episodesCount = Integer.parseInt(scan.nextLine());
        double episodeTime = Double.parseDouble(scan.nextLine());

        double advertisementTime = episodeTime * 0.2;

        double episodeTimeWithAdvertisement = episodeTime + advertisementTime;

        double totalTime = episodeTimeWithAdvertisement * episodesCount * seasonsCount + (seasonsCount * 10);

        System.out.println(String.format("Total time needed to watch the %s series is %.0f minutes.",
                serialName, Math.floor(totalTime)));
    }
}
