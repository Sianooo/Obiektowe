package pakiet2;

import pakiet1.Pojazd;

public class Samolot extends Pojazd {
     public Samolot() {
          super("Boeing 747", 2015, 50000000.0, "Niebieski");
          System.out.println("Wartości pól w klasie Samolot:");
          System.out.println("Nazwa: " + this.nazwa);// Dostep jest wszedzie
          System.out.println("Cena: " + this.cena); // Dostep jest bo dziedziczy
//          System.out.println("Kolor: " + this.kolor); Nie jest dostepny bo nie jest w tym samym pakiecie
     }
}
