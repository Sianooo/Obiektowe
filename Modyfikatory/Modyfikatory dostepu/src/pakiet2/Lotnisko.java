package pakiet2;

import pakiet1.Pojazd;

public class Lotnisko {
    public Lotnisko() {
        Pojazd pojazd = new Pojazd("Samolot", 2018, 1000000.0, "Biały");
        System.out.println("Wartości pól w klasie Lotnisko:");
        System.out.println("Nazwa: " + pojazd.nazwa); // Dostep jest wszedzie
//        System.out.println("Cena: " + pojazd.cena); Dostep do pola cena nie jest dostepny poniewaz klasa lotnisko nie dziedziczy po klasie pojazd ani nie jest w tym samym pakiecie
//        System.out.println("Kolor: " + pojazd.kolor);  Dostep do pola cena nie jest dostepny poniewaz klasa lotnisko  nie jest w tym samym pakiecie
    }
}
