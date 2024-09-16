public class Klawiatura extends Komputer{
    String typklawiatury;

    public Klawiatura(int koszt, String producent, boolean czynowy, String typ) {
        super(koszt, producent, czynowy);
        this.typklawiatury = typ;
    }
}
