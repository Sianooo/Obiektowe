public class Telefon extends Komputer{
    String kolor;

    public Telefon(String nazwaProcesoru, double iloscRAM, String nazwaGPU, String kolor) {
        super(nazwaProcesoru, iloscRAM, nazwaGPU);
        this.kolor = kolor;
    }

    @Override
    void wypisz(){
        super.wypisz();
        System.out.println("W jakim jest kolorze   "+kolor);
    }
}
