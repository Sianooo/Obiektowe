public class Komputer {
    int koszt;
    String producent;
    boolean czynowy;



    void On()
    {
        System.out.println("Komputer jest wlaczony");
    }
    void Off()
    {
        System.out.println("Komputer jest wyłaczony");
    }

    public Komputer(int koszt, String producent, boolean czynowy) {
        this.koszt = koszt;
        this.producent = producent;
        this.czynowy = czynowy;
    }
}
