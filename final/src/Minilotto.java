public class Minilotto {

    final int[] liczby;

    public Minilotto(int[] liczba) {
        liczby = liczba;

    }
    void pokazLiczby(){
        System.out.println("Podane liczby: ");
        for(int i=0;i<liczby.length;i++)
        {
            System.out.println(liczby[i]);
        }
        System.out.println();
        System.out.println();
    }
}