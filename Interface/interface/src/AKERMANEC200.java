public class AKERMANEC200 implements Kopanie,Uruchamianie {

    @Override
    public void wypoziomujPojazd() {
        System.out.println("Pojazd zosatał wypoziomowany");
    }

    @Override
    public boolean opuszczonoLyzke(double oIle) {
        return false;
    }

    @Override
    public boolean podniesionoLyzke(double oIle) {
        return false;
    }

    @Override
    public void odsunietoLyzke() {
        System.out.println();
    }

    @Override
    public void przysunietoLyzke() {
        System.out.println();
    }

    @Override
    public void obrotWPrawo(double katObrotu) {
        System.out.println("Obrocono w prawo " + katObrotu + " stopni");
    }

    @Override
    public void obrotWLewo(double katObrotu) {
        System.out.println("Obrocono w lewo " + katObrotu + " stopni");
    }

    @Override
    public void uruchom() {
        System.out.println("Pojazd zostal uruchomiony");
    }


}