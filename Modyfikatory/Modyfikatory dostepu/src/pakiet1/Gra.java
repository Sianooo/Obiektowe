package pakiet1;

public class Gra {
    public Gra() {
        Pojazd pojazd = new Pojazd("Samochod", 2020, 50000.0, "Czerwony");
        System.out.println("Wartości pól w klasie Gra:");
        System.out.println("Nazwa: " + pojazd.nazwa); //Dostepny jest wszedzie
        System.out.println("Cena: " + pojazd.cena); //Dostepny bo jest w tym samym pakiecie
        System.out.println("Kolor: " + pojazd.kolor); //Dostepny bo jest w tym samym pakiecie
    }
}
