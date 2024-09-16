public class Kamerka extends Komputer{
    int katnagrywania;

    public Kamerka(int koszt, String producent, boolean czynowy, int katnagrywania) {
        super(koszt, producent, czynowy);
        this.katnagrywania = katnagrywania;
    }
}
