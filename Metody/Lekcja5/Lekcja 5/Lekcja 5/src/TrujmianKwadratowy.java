public class TrujmianKwadratowy {

    int a;
    int b;
    int c;

    public int liczDelte(){
        return b*b -4*a*c;
    }

    public TrujmianKwadratowy(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
