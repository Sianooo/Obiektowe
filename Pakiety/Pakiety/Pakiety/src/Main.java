import owady.Fly;
import pojazdy.Car;
import java.util.*;

public class Main {
    public static void main(String[] args) {
       /*zad.0*/ Fly owady=new Fly();
       Car pojazdy=new Car();

       /*Zad.1*/ Scanner scanner = new Scanner(System.in);
        System.out.println("Wpisz liczby: ");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = a + b;
        System.out.println("Suma to: "+sum);

        /*Zad3*/Scanner scanner1 = new Scanner(System.in);
        String first = scanner1.next();
        String last = scanner1.next();
        Human human= new Human(first,last);
        System.out.println("Name: "+human.firstname);
        System.out.println("Lastname: "+human.lastname);
        System.out.println();

        /*HISTORIA HUMANA*/
       Scanner scanner3 = new Scanner(System.in);

       System.out.println("Podaj imię osoby: ");
       String name = scanner.nextLine();

       System.out.println("Czy osoba jest dorosła? (true/false): ");
       boolean isAdult = scanner.nextBoolean();

       System.out.println("Podaj wiek osoby: ");
       int age = scanner.nextInt();

       System.out.println("Podaj wagę osoby: ");
       double weight = scanner.nextDouble();

       System.out.println("Podaj zawód osoby: ");
       scanner.nextLine();
       String job = scanner.nextLine();

       System.out.println("Podaj pierwszą literę ulubionego koloru osoby: ");
       char favoriteColor = scanner.next().charAt(0);

       System.out.println("Wprowadzone dane dla człowieka:");
       System.out.println("Imię: " + name);
       System.out.println("Czy jest dorosły? " + isAdult);
       System.out.println("Wiek: " + age + " lat");
       System.out.println("Waga: " + weight + " kg");
       System.out.println("Zawód: " + job);
       System.out.println("Pierwsza litera ulubionego koloru: " + favoriteColor);

       scanner.close();













    }
}