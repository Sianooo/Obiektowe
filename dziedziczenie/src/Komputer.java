public class Komputer {
    /*Zad 1*/
    String nazwaProducenta;
    int iloscRdzeniProcesora;
    boolean czyJestStworzonyDoGier;

    public Komputer(){}

    public Komputer(String nazwaProducenta, int iloscRdzeniProcesora, boolean czyJestStworzonyDoGier) {
        this.nazwaProducenta = nazwaProducenta;
        this.iloscRdzeniProcesora = iloscRdzeniProcesora;
        this.czyJestStworzonyDoGier = czyJestStworzonyDoGier;
    }

    public void dodajRdzenie (int iloscRdzeniProcesora)
    {
        this.iloscRdzeniProcesora =iloscRdzeniProcesora;
    }

    public void ustawNazwe(String nazwaProducenta)
    {
        this.nazwaProducenta=nazwaProducenta;
    }
}
