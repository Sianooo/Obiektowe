public class Monitor extends Komputer{
    int hz;

    public Monitor(int koszt, String producent, boolean czynowy, int hz) {
        super(koszt, producent, czynowy);
        this.hz = hz;
    }
}
