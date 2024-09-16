public class PC extends Komputer{
    int iloscPortowHDMI;

    public PC(String nazwaProcesoru, double iloscRAM, String nazwaGPU, int iloscPortowHDMI) {
        super(nazwaProcesoru, iloscRAM, nazwaGPU);
        this.iloscPortowHDMI = iloscPortowHDMI;
    }

    @Override
    void wypisz(){
        super.wypisz();
        System.out.println("Ilosc portow   "+iloscPortowHDMI);
    }
}
