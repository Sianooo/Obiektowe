public class Main {
    public static void main(String[] args) {
        /*Zad 2*/
    Komputer komputerek = new Komputer("hp",9,true);
    komputerek.dodajRdzenie(12);
    komputerek.ustawNazwe("Sławcio");
    }
    /*Zad 6*/
    Laptop laptop= new Laptop(2500);
    Tablet tablet= new Tablet(true);
    Smartphone smartphone= new Smartphone(14);
    SmartTV smartTV= new SmartTV(100);
}
