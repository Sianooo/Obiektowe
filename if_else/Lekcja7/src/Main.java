import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*Zad 2*/
        /*Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj a: ");
        int a = scanner.nextInt();
        System.out.println("Podaj b: ");
        int b = scanner.nextInt();
        System.out.println("Podaj c: ");
        int c = scanner.nextInt();

        Trojkat trojkat = new Trojkat(a , b, c);
        System.out.println("Czy wyjdzie trojkat: "+trojkat.czyDaSieZrobicTrojkat());



         */
         /*Zad3*/
         /*int number = scanner.nextInt();
         if(number<10)
         {
             System.out.println("0-9");
         }
        else if(number<20)
        {
            System.out.println("10-19");
        }
        else if(number<30)
        {
            System.out.println("20-29");
        }
        else if(number<40)
        {
            System.out.println("30-39");
        }
        else if(number<50)
        {
            System.out.println("40-49");
        }
         else if(number<60)
         {
             System.out.println("50-59");
         }
         else if(number<70)
         {
             System.out.println("60-69");
         }
         else if(number<80)
         {
             System.out.println("70-79");
         }
         else if(number<90)
         {
             System.out.println("80-89");
         }
         else if(number<100)
         {
             System.out.println("90-99");
         }
         else{
             System.out.println("100");
         }*/


         /*Zad4*/
        /*int delta =9;
        if(delta !=0) {
            if (delta > 0) {
                System.out.println("dwa miejsca");
            } else {
                System.out.println("brak miejsc");
            }
        }else
        {
            System.out.println("jedno miejsce");
        }*/

        /*Zad5*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj imie: ");
        String name = scanner.next();
        System.out.println("Podaj wiek: ");
        int age = scanner.nextInt();
        System.out.println("Podaj plec: ");
        String gender = scanner.next();
        Human human = new Human(age,gender,name);
        human.daneOsobowe();






    }
}