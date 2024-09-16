public class Phone extends Komputer{
    boolean faceID;

    public Phone(int koszt, String producent, boolean czynowy, boolean faceID) {
        super(koszt, producent, czynowy);
        this.faceID = faceID;
    }
}
