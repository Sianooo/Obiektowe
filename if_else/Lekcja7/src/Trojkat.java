public class Trojkat{
        int a;
        int b;
        int c;

        public Trojkat(int a, int b, int c) {
            this.a = a;
            this.b = b;
            this.c = c;
        }

        public boolean czyDaSieZrobicTrojkat()
        {
            return (a+b>c && a+c >b && b+c>a && a>0 && b>0 && c>0);
        }
    }


