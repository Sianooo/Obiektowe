public class Samolot implements Latanie,Jezdzenie{

    @Override
    public void jedzWPrawo(double oIle) {
        System.out.println("Jedziesz w prawo o " +oIle);
    }

    @Override
    public void jedzWLewo(double oIle) {
        System.out.println("Jedziesz w lewo o " +oIle);
    }

    @Override
    public void jedzProsto(double oIle) {
        System.out.println("Jedziesz prosto o ");
    }

    @Override
    public void uniesDziob() {
        System.out.println("Unosisz dziob o ");
    }

    @Override
    public void oposcDziob() {
        System.out.println("Opuszczasz dziob o ");
    }

    @Override
    public void przechylenieWPrawo(double oIle) {
        System.out.println("Przechylasz sie w prawo o " +oIle);
    }

    @Override
    public void przechylenieWLewo(double oIle) {
        System.out.println("Przechylasz sie w lewo o" +oIle);
    }
}
