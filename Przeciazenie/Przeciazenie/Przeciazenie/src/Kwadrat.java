public class Kwadrat extends Figura{
    double wysokosc;

    public Kwadrat(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    @Override
    void obliczObwod()
    {
        System.out.println("Obwod:"+wysokosc*4);
    }
    @Override
    void obliczPole()
    {
        System.out.println("Pole"+wysokosc*wysokosc);
    }
}
