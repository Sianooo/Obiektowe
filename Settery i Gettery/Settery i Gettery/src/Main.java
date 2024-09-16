import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wysokość w metrach: ");
        float wysokosc = scanner.nextFloat();
        System.out.println("Podaj szerokość w metrach: ");
        float szerokosc = scanner.nextFloat();
        System.out.println("Podaj liczbę pięter: ");
        int liczbaPieter = scanner.nextInt();
        System.out.println("Podaj lokację: ");
        String lokacja = scanner.next();
        System.out.println("Podaj rok wybudowania: ");
        int rokWybudowania = scanner.nextInt();
        System.out.println("Podaj właściciela: ");
        String wlasciciel = scanner.next();
        System.out.println("Podaj ilość mebli: ");
        int iloscMebli = scanner.nextInt();
        System.out.println("Podaj liczbę pracowników: ");
        int liczbaPracownikow = scanner.nextInt();


        Skyscraper skyscraper = new Skyscraper(wysokosc, szerokosc, liczbaPieter, lokacja, rokWybudowania);

        skyscraper.setWlasciciel(wlasciciel);
        skyscraper.setIloscMebli(iloscMebli);
        skyscraper.setLiczbaPracownikow(liczbaPracownikow);


        System.out.println("Wysokość w metrach: " + skyscraper.getWysokoscWMetrach());
        System.out.println("Szerokość w metrach: " + skyscraper.getSzerokoscWMetrach());
        System.out.println("Liczba pięter: " + skyscraper.getLiczbaPieter());
        System.out.println("Lokacja: " + skyscraper.getLokacja());
        System.out.println("Rok wybudowania: " + skyscraper.getRokWybudowania());
        System.out.println("Właściciel: " + skyscraper.getWlasciciel());
        System.out.println("Ilość mebli: " + skyscraper.getIloscMebli());
        System.out.println("Liczba pracowników: " + skyscraper.getLiczbaPracownikow());

        scanner.close();
    }
}
