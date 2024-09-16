public class Kolo extends Figura{

    double promien;

    public Kolo(double promien) {
        this.promien = promien;
    }

    @Override
    void obliczObwod()
    {
        System.out.println("Obwod:"+2*3.14*promien);
    }
    @Override
    void obliczPole()
    {
        System.out.println("Pole"+3.14*(promien*promien));
    }
}
