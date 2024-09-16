public class CATERPILLARM318D implements Kopanie,Uruchamianie {

    @Override
    public void wypoziomujPojazd() {
        System.out.println("Pojazd zosatał wypoziomowany");
    }

    @Override
    public boolean opuszczonoLyzke(double oIle) {

        System.out.println("Opuszczono lyzke o "+oIle);
        return true;
    }
    @Override
    public boolean podniesionoLyzke(double oIle) {
        System.out.println("Podniesiono lyzke o "+oIle);
        return true;
    }

    @Override
    public void odsunietoLyzke() {
        System.out.println("Odsunieto lyzke");
    }

    @Override
    public void przysunietoLyzke() {
        System.out.println("Przysunieto lyzke");
    }

    @Override
    public void obrotWPrawo(double katObrotu) {
        System.out.println("Obrocono w prawo "+katObrotu+" stopni");
    }

    @Override
    public void obrotWLewo(double katObrotu) {
        System.out.println("Obrocono w lewo "+katObrotu+" stopni");
    }

    @Override
    public void uruchom() {
        System.out.println("Pojazd zosatal uruchomiony");
    }

    public void kopanie(double kop)
    {
        opuszczonoLyzke(1.5 +kop);
        przysunietoLyzke();
        podniesionoLyzke(1.5+kop+1);
        obrotWLewo(60);
        odsunietoLyzke();
        obrotWPrawo(60);
    }
}
