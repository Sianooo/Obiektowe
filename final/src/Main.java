import java.util.Scanner;

public class Main {
    //  FinalnaKlasa obiekt = new FinalnaKlasa();
//            obiekt.wykonajCos();
//
//            Citizen citizen = new Citizen(123,"Patryk","Jaskiniowiec");
//            System.out.println();
//            System.out.println(citizen.id);


//    public static void main(String[] args) {
//        KuponTotolotek[] kupony = new KuponTotolotek[3];
//        Scanner scanner = new Scanner(System.in);
//        for (int i = 0; i < 1; i++) {
//            int[] liczby = new int[6];
//            System.out.println("Kupon: " + i);
//            for (int j = 0; j < 6; j++) {
//                System.out.println("Podaj kolejna liczbe: ");
//                liczby[j] = scanner.nextInt();
//            }
//            kupony[i] = new KuponTotolotek(liczby);
//            kupony[i].pokazLiczby();
//        }

        public static void main(String[] args) {
            Minilotto[] kupony = new Minilotto[3];
            Scanner scanner = new Scanner(System.in);
            for (int i = 0; i < 1; i++) {
                int[] liczby = new int[5];
                System.out.println("Kupon: " + i);
                for (int j = 0; j < 5; j++) {
                    System.out.println("Podaj kolejna liczbe: ");
                    liczby[j] = scanner.nextInt();
                }
                kupony[i] = new Minilotto(liczby);
                kupony[i].pokazLiczby();
            }


        }
    }

