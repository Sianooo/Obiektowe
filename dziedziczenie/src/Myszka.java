public class Myszka extends Komputer{
    int dpi;

    public Myszka(int koszt, String producent, boolean czynowy, int dpi) {
        super(koszt, producent, czynowy);
        this.dpi = dpi;
    }
}
