public class Konsola extends Komputer{
    boolean DVD;

    public Konsola(int koszt, String producent, boolean czynowy, boolean DVD) {
        super(koszt, producent, czynowy);
        this.DVD = DVD;
    }
}
