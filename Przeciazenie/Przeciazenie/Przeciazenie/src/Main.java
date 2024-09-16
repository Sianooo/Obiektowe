import java.util.Scanner;
import java.util.concurrent.TimeoutException;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);


//        /*Zadanie 2*/
//        Figura[] zbioMoichFigur =new Figura[3];
//
//        double a= scanner.nextDouble();
//        double b= scanner.nextDouble();
//        double c= scanner.nextDouble();
//
//        zbioMoichFigur[0]=new Trojkat(a);
//        zbioMoichFigur[1]=new Kwadrat(a);
//        zbioMoichFigur[2]= new Kolo(a);
//
//
//        for(Figura figura:zbioMoichFigur)
//        {
//            figura.obliczObwod();
//            figura.obliczPole();
//        }


          /*Zadanie 1*/
//        System.out.println("Wprowadz liczbe zeby obliczyc obwod i pole kwadratu");
//        double a = scanner.nextInt();
//        Figura figura = new Kwadrat(a);
//        figura.obliczObwod();
//        figura.obliczPole();
//        System.out.println();
//
//        System.out.println("Wprowadz liczbe zeby obliczyc obwod i pole trojkata");
//        double h= scanner.nextDouble();
//        a= scanner.nextDouble();
//        double b= scanner.nextDouble();
//        double c= scanner.nextDouble();
//        Figura figura2= new Trojkat(a,b,c);
//        figura2.obliczPole();
//        figura2.obliczObwod();
//        System.out.println();
//
//        System.out.println("Wprowadz liczbe zeby obliczyc obwod i pole kola");
//        a= scanner.nextDouble();
//        Figura figura3= new Kolo(a);
//        figura3.obliczPole();
//        figura3.obliczObwod();


        
        /*Przeslanianie*/
        /*Zadanie 1*/
        Komputer komp= new Komputer("AMD Ryzen 5 5678",16,"NVidia RTX 4090");
        PC pc = new PC("Intel i9-973323",32,"NVidia RTX 3060",4);
        Laptop laptop = new Laptop("AMD Ryzen 4 8787",8,"NVidia RTX 2090",true);
        Telefon telefon = new Telefon("Apple A16 bionic",8,"Apple GPU","Red");

        komp.wypisz();
        pc.wypisz();
        laptop.wypisz();
        telefon.wypisz();
    }
}