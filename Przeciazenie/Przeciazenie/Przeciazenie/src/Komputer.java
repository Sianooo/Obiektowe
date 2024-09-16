public class Komputer {

    String nazwaProcesoru;
    double iloscRAM;
    String nazwaGPU;

    public Komputer(String nazwaProcesoru, double iloscRAM, String nazwaGPU) {
        this.nazwaProcesoru = nazwaProcesoru;
        this.iloscRAM = iloscRAM;
        this.nazwaGPU = nazwaGPU;
    }

    void wypisz(){
        System.out.println("Nazwa procesora   "+nazwaProcesoru);
        System.out.println("Ile RAM   "+iloscRAM);
        System.out.println("Nazwa GPU  "+nazwaGPU);
    }
}
