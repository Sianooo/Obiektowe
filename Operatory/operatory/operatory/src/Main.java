

import java.util.Scanner;

public class Main {
    static char lastName;
    static String firstName;
    static double lata;
    static boolean wantsToBuyMore;
    static int age;
    public static void Input(int stage) {
        Scanner scanner = new Scanner(System.in);



        switch (stage) {
            case 0:
                try {
                    System.out.println("Podaj imię");
                    firstName = scanner.next();
                    Input(stage+1);
                } catch(Exception e) {
                    System.out.println("Podaj poprawną wartość!");
                    Input(stage);
                }

                break;
            case 1:
                try {
                    System.out.println("Podaj nazwisko");
                    lastName = scanner.next().charAt(0);
                    Input(stage+1);
                } catch(Exception e) {
                    System.out.println("Podaj poprawną wartość!");
                    Input(stage);
                }

                break;
            case 2:
                try {
                    System.out.println("Podaj czas od momentu w którym bohater zaczął grać na gitarze w latach (double)");
                    lata = scanner.nextDouble();
                    Input(stage+1);
                } catch(Exception e) {
                    System.out.println("Podaj poprawną wartość!");
                    Input(stage);
                }

                break;
            case 3:
                try {
                    System.out.println("Podaj, czy twój bohater ma chcieć kupować więcej gitar (true/false).");
                    wantsToBuyMore = scanner.nextBoolean();
                    Input(stage+1);
                } catch(Exception e) {
                    System.out.println("Podaj poprawną wartość!");
                    Input(stage);
                }

                break;
            case 4:
                try {
                    System.out.println("Podaj wiek (int)");
                    age = scanner.nextInt();
                    Input(stage+1);
                } catch(Exception e) {
                    System.out.println("Podaj poprawną wartość!");
                    Input(stage);
                }

                break;
            case 5:

                System.out.println("To jest " + firstName + ".");
                System.out.println("Jego nazwisko zaczyna się od litery " + lastName + ".");
                System.out.println("On gra na gitarze od " + lata + " lat.");
                if (wantsToBuyMore) {
                    System.out.println("Chce kupować więcej gitar");
                } else {
                    System.out.println("Nie chce kupować więcej gitar");
                }
                System.out.println("On ma teraz " + age + " lat, ale kiedy zaczął grać na gitarze miał " + (age - lata) + ".");
                break;
        }



    }
    public static void main(String[] args) {

        /*String first = scanner.next();
        String last = scanner.next();
        Human human = new Human(first, last);
        System.out.println("Human:");
        System.out.println("     Imię: " + human.firstName);
        System.out.println("     Nazwisko: " + human.lastName);*/

        //Input(0);


        Scanner scanner = new Scanner(System.in);
        System.out.println();
        /*System.out.println("Wprowadź liczbę stopni:");
        float degrees = scanner.nextFloat();
        Car car = new Car();
        System.out.println(car.createRightTurnNotificationText(degrees));
        System.out.println("Podaj a:");
        float a = scanner.nextFloat();
        System.out.println("Podaj b:");
        float b = scanner.nextFloat();
        System.out.println("Podaj c:");
        float c = scanner.nextFloat();
        TrojmianKwadratowy trojmianKwadratowy = new TrojmianKwadratowy(a,b,c);
        System.out.println("delta: " + trojmianKwadratowy.liczDelte());

        System.out.println((3123123%47));
        System.out.println(((((6 << 4) >> 2) << 7) << 2) >> 10);

        System.out.println();
        System.out.println();

        int a = 192 & 255;
        int b = 168 & 255;
        int c = 57 & 252;
        int d = 2 & 0;
        System.out.println(a+"."+b+"."+c+"."+d);

        System.out.println("Podaj imie:");
        String firstname = scanner.next();
        System.out.println("Podaj wiek:");
        int wiek = scanner.nextInt();
        Human human = new Human(firstname, wiek);
        System.out.println("Jest emerytem: " + human.jestEmerytem());
*/

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        Trojkat trojkat = new Trojkat(a , b, c);
        System.out.println("Czy wyjdzie trojkat: "+trojkat.czyDaSieZrobicTrojkat());



    }
}
