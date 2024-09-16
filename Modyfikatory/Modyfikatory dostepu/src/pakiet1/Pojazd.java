package pakiet1;

public class Pojazd {
    public String nazwa;
    private int rokProdukcji;
    protected double cena;
    String kolor;

    public Pojazd(String nazwa, int rokProdukcji, double cena, String kolor) {
        this.nazwa = nazwa;
        this.rokProdukcji = rokProdukcji;
        this.cena = cena;
        this.kolor = kolor;
    }
}
