public class Myszka implements Klikanie,Poruszanie{
    /*Zadanie 3*/
    @Override
    public void wcisnij()
    {
        System.out.println("Wcisnieto");
    }
    @Override
    public void odkliknij()
    {
        System.out.println("Odkliknieto");
    }
    @Override
    public  void poruszWPrawo(double oIle)
    {
        System.out.println("Poruszono w prawo o "+ oIle);
    }
    @Override
    public void poruszWLewo(double oIle)
    {
        System.out.println("Poruszono w lewo o " +oIle);
    }
    @Override
    public void poruszWGore(double oIle)
    {
        System.out.println("Poruszono w gore o " + oIle);
    }
    @Override
    public void poruszWDol(double oIle)
    {
        System.out.println("Poruszono w dol o " + oIle);
    }
    @Override
    public void podnies(double ileWGore)
    {
        System.out.println("Podniesiono o " + ileWGore);
    }

}
