public class Skyscraper {

    private float wysokoscWMetrach;
    private float szerokoscWMetrach;
    private int liczbaPieter;
    private String lokacja;
    private int rokWybudowania;



    private String wlasciciel;
    private int iloscMebli;
    private int liczbaPracownikow;


    public Skyscraper(float wysokoscWMetrach, float szerokoscWMetrach, int liczbaPieter, String lokacja, int rokWybudowania) {
        this.wysokoscWMetrach = wysokoscWMetrach;
        this.szerokoscWMetrach = szerokoscWMetrach;
        this.liczbaPieter = liczbaPieter;
        this.lokacja = lokacja;
        this.rokWybudowania = rokWybudowania;
    }

    public float getWysokoscWMetrach() {
        return wysokoscWMetrach;
    }

    public float getSzerokoscWMetrach() {return szerokoscWMetrach;}

    public int getLiczbaPieter() {
        return liczbaPieter;
    }

    public String getLokacja() {
        return lokacja;
    }

    public int getRokWybudowania() {
        return rokWybudowania;
    }

    public String getWlasciciel() {
        return wlasciciel;
    }

    public int getIloscMebli() {
        return iloscMebli;
    }

    public int getLiczbaPracownikow() {
        return liczbaPracownikow;
    }

    public void setWlasciciel(String wlasciciel) {
        this.wlasciciel = wlasciciel;
    }

    public void setIloscMebli(int iloscMebli) {
        this.iloscMebli = iloscMebli;
    }

    public void setLiczbaPracownikow(int liczbaPracownikow) {
        this.liczbaPracownikow = liczbaPracownikow;
    }


}
