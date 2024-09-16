public class Laptop extends Komputer{
    boolean czyEkranDotykowy;

    public Laptop(String nazwaProcesoru, double iloscRAM, String nazwaGPU, boolean czyEkranDotykowy) {
        super(nazwaProcesoru, iloscRAM, nazwaGPU);
        this.czyEkranDotykowy = czyEkranDotykowy;
    }

    @Override  /* <------------ to jest przeslanianie @Override! */
    void wypisz(){
        super.wypisz();//zeby wypisywalo w main te rzeczy
        System.out.println("Czy ma dotykowy ekran   "+(czyEkranDotykowy?"Tak":"Nie"));
    }
}
