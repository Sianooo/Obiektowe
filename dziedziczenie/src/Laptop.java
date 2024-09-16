public class Laptop extends Komputer{
    int howmuchmemory;

    public Laptop(int koszt, String producent, boolean czynowy, int howmuchmemory) {
        super(koszt, producent, czynowy);
        this.howmuchmemory = howmuchmemory;
    }
}
