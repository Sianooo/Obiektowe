public class Trojkat extends Figura {

    double podstawa;
    double ramie;
    double ramie2;

    public Trojkat(double podstawa, double ramie, double ramie2) {
        this.podstawa = podstawa;
        this.ramie = ramie;
        this.ramie2 = ramie2;
    }

    public Trojkat(double podstawa) {
        this.podstawa = podstawa;
        this.ramie=podstawa;
        this.ramie2=podstawa;
    }

    @Override
    void obliczObwod() {
        System.out.println("Obwod: " + (podstawa + ramie + ramie2));
    }

    @Override
    void obliczPole() {
        double p = (podstawa + ramie + ramie2) / 2;
        double pole = Math.sqrt(p * (p - podstawa) * (p - ramie) * (p - ramie2));
        System.out.println("Pole: " + pole);
    }

}
