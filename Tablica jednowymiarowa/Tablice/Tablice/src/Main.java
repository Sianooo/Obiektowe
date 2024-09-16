public class Main {
    public static void dodajJedenDoElementowTablicy(int[] liczby) {
        for (int i = 0; i < liczby.length; i++) {
            liczby[i]++;
        }
    }

    public static void dodajliczba(int liczba) {
        liczba++;
    }

    public static void main(String[] args) {
        /*Zad 1*/
        /*
        String[] uczniowieWSali = new String[14];
        uczniowieWSali[0]="Mirek";
        uczniowieWSali[1]="Kamilos";
        uczniowieWSali[2]="Bartek";
        uczniowieWSali[3]="Maciek";
        uczniowieWSali[4]="Dawid";
        uczniowieWSali[5]="Hubełt";
        uczniowieWSali[6]="Sikorka";
        uczniowieWSali[7]="Olek";
        uczniowieWSali[8]="Patryk";
        uczniowieWSali[9]="Maciek";
        uczniowieWSali[10]="Michał";
        uczniowieWSali[11]="Maciek";
        uczniowieWSali[12]="Karol";
        uczniowieWSali[13]="Patryk";

        for(int i=0;i<uczniowieWSali.length;i++)
        {
            System.out.println(uczniowieWSali[i]);
        }
        System.out.println();
        System.out.println();

        for(String uczenWSali : uczniowieWSali)
        {
            System.out.println(uczenWSali);
        }*/

        /*Zad 2*/
        /*
        double[] staleMatematyczne = new double[4];
        staleMatematyczne[0]= 3.1415926535;
        staleMatematyczne[1]= 2.7182818284;
        staleMatematyczne[2]= 1.2020569031;
        staleMatematyczne[3]= 0.2614972128;

        String[] opis= new String[4];
        opis[0]="Symbol liczby Pi - π - został pierwszy raz użyty w 1706 roku. Jest to pierwsza litera greckiego słowa περίμετρον – perimetron, co oznacza obwód. Liczba Pi – zgodnie z matematyczną definicją – to stosunek obwodu koła do jego średnicy, zapisywana jest w postaci symbolu: π, jest liczbą niewymierną i przestępną.";
        opis[1]="Gdy wartość a zmienia się od 2.71 do 2.72, wykres pochodnej funkcji pokrywa się z wykresem funkcji pierwotnej, co oznacza, że obie funkcje są równe. Wartość a dla której to zachodzi, to liczba e (znana także jako liczba Eulera, podstawa logarytmu naturalnego lub liczba Nepera). Stała ta jest liczbą niewymierną.";
        opis[2]="Stała Apéry’ego – stała matematyczna będąca wartością funkcji dzeta Riemanna o argumencie 3. Oznaczana literą ";
        opis[3]="Choina Mertensa wyróżnia się od innych choin tym, że igły są prawie równej długości i są promieniście ułożone, rozchodząc się na wszystkie strony. Na krótkich bocznych gałązkach często są ścieśnione, na głównych pędach luźniej rozstawione. Występuje tylko jeden środkowy kanał żywiczny poniżej wiązki przewodzącej.";
        for(int i=0;i<1;i++){
            System.out.println("Zmienna Pi wynosi: "+staleMatematyczne[0]+" "+opis[0]);
            System.out.println("Zmienna e wynosi: "+staleMatematyczne[1]+" "+opis[1]);
            System.out.println("Zmienna a wynosi: "+staleMatematyczne[2]+" "+opis[2]);
            System.out.println("Zmienna k wynosi: "+staleMatematyczne[3]+" "+opis[3]);
        }*/
        /*Zad 2.5*/

        int[] someNumbers = new int[10];
        for (int i = 0; i < someNumbers.length; i++) {
            someNumbers[i] = i;
        }

        for (int values : someNumbers) {
            System.out.println(values);// 0-9

            dodajJedenDoElementowTablicy(someNumbers);
            for (int value : someNumbers) {
                System.out.println(values);
            }
            int liczba = 7;
            System.out.println(liczba);
            dodajliczba(liczba);
            System.out.println(liczba);
            System.out.println();
            int[] someOtherNumbers = new int[10];
            someOtherNumbers = someNumbers;
            dodajJedenDoElementowTablicy(someOtherNumbers);
            for (int value1 : someNumbers) System.out.println(value1);
            System.out.println(someNumbers);
            System.out.println(someOtherNumbers);


        }

        System.out.println();
        /*Czesc do zadania 3*/

        String[] nazwiska = new String[2];
        nazwiska[0] = "Michnik";
        nazwiska[1] = "Slawek";
        System.out.println("Ilosc liter w nazwiskach :" + policzLitery(nazwiska));


        /*Czesc do zadania 3.5*/
        System.out.println();
        int[]tab= new  int[6];
        tab[0]=34;
        tab[1]=67;
        tab[2]=57;
        tab[3]=22;
        tab[4]=23;
        tab[5]=78;
        tab=sort(tab);
        for(int a : tab)
        {
            System.out.println(a);
        }
        System.out.println();
        int[]tab2= new  int[6];
        tab2[0]=100;
        tab2[1]=45;
        tab2[2]=67;
        tab2[3]=12;
        tab2[4]=19;
        tab2[5]=33;
        tab2=sort(tab2);
        for(int b : tab2)
        {
            System.out.println(b);
        }


        /*Zad 4*/
        int [][] totolotto= new int[5][6];
        totolotto[0]= new int[]{49,21,78,89,4,23};
        totolotto[1]= new int[]{55,78,12,21,34,90};
        totolotto[2]= new int[]{21,34,32,56,64,89};
        totolotto[3]= new int[]{1,2,43,57,95,38};
        totolotto[4]= new int[]{32,8,34,90,22,87};

        System.out.println("piec ostatnich losowan: ");
        for(int[] s : totolotto)
        {
            for(int j=0;j<s.length;j++) {
                System.out.printf(s[j]+"");
            }
            System.out.println();
        }

        /*Zad 5*/
        Znaczek[] klaser = new Znaczek[256];
        for(int i=0;i< klaser.length/2;i++)
        {
            klaser[i] = new Znaczek(i);
        }

    }

    /*Zad 3*/
    static int policzLitery(String[] znaki) {
        int suma = 0;
        for (int i = 0; i < znaki.length; i++) {
            suma += znaki[i].length();

        }
        return suma;
    }
    /*Zad 3.5*/
    static int[] sort(int[] tab)
    {
        for (int i = 0; i < tab.length; i++)
        {
            for (int j = tab.length - 1; j > 0; j--)
            {
                if (tab[j-1] > tab[j]) {
                    int temp = tab[j];
                    tab[j] = tab[j-1];
                    tab[j-1] = temp;
                }
            }
        }
        return tab;
    }
}