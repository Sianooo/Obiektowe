import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args){


    Monitor monitor = new Monitor();
    Monitor monitor2 = new Monitor();
    Monitor monitor3= new Monitor();
    Monitor monitor4 = new Monitor();
    Monitor monitor5 = new Monitor();
    Monitor monitor6 = new Monitor();
    Monitor monitor7 = new Monitor();
    Monitor monitor8 = new Monitor();
    Monitor monitor9 = new Monitor();
    Monitor monitor10 = new Monitor();
    Monitor monitor11= new Monitor();
    Monitor monitor12= new Monitor();
    Monitor monitor13 = new Monitor();
    Monitor monitor14 = new Monitor();
    Monitor monitor15 = new Monitor();
    Monitor monitor16 = new Monitor();
    Monitor monitor17= new Monitor();
    Monitor monitor18= new Monitor();
    Monitor monitor19= new Monitor();
    Monitor monitor20= new Monitor();
    Monitor monitor21= new Monitor();
    Monitor monitor22= new Monitor();


    Keyboard keyboard = new Keyboard();
    Keyboard keyboard2 = new Keyboard();
    Keyboard keyboard3 = new Keyboard();
    Keyboard keyboard4 = new Keyboard();
    Keyboard keyboard5 = new Keyboard();
    Keyboard keyboard6 = new Keyboard();
    Keyboard keyboard8= new Keyboard();
    Keyboard keyboard9 = new Keyboard();
    Keyboard keyboard10 = new Keyboard();
    Keyboard keyboard11 = new Keyboard();
    Keyboard keyboard12 = new Keyboard();
    Keyboard keyboard13 = new Keyboard();
    Keyboard keyboard14 = new Keyboard();
    Keyboard keyboard15 = new Keyboard();
    Keyboard keyboard16 = new Keyboard();
    Keyboard keyboard17 = new Keyboard();
    Keyboard keyboard18 = new Keyboard();
    Keyboard keyboard19 = new Keyboard();
    Keyboard keyboard20 = new Keyboard();
    Keyboard keyboard21 = new Keyboard();
    Keyboard keyboard22 = new Keyboard();


    Desk desk = new Desk();
    Desk desk2 = new Desk();
    Desk desk3 = new Desk();
    Desk desk4 = new Desk();
    Desk desk5 = new Desk();
    Desk desk6 = new Desk();
    Desk desk7 = new Desk();
    Desk desk8 = new Desk();
    Desk desk9 = new Desk();
    Desk desk10 = new Desk();
    Desk desk11 = new Desk();
    Desk desk12 = new Desk();
    Desk desk13 = new Desk();

    String firstName = "Santa";
    String lastName = "Claus";
    String country = "Finlandia";
    String city = "Rovaniemi";
    int zipCode = 96930;
    String street = "Tähtikuja1";


        System.out.println("Imie " + firstName);
        System.out.println("Nazwisko " + lastName);
        System.out.println("Kraj " + country);
        System.out.println("Miasto " + city);
        System.out.println("Kod pocztowy " + zipCode);
        System.out.println("Ulica " + street);

        System.out.println( );

        Monitor monitorX = new Monitor();
        monitorX.Hz=120;
        monitorX.company="HP";
        monitorX.ekran.rozdzielczosc= "70";
        monitorX.ekran.typMatrycy="Swiecaca sie";
        monitorX.isMatteColor= false;
        monitorX.ladowarka.maxNapiecie=220;
        monitorX.ladowarka.maxNatezenie=10;
        monitorX.model="Samsung";
        monitorX.watts=50;
        System.out.println("Hz: "+monitorX.Hz);
        System.out.println("Company: "+monitorX.company);
        System.out.println("Matte Color: "+monitorX.isMatteColor);
        System.out.println("Max napiecie "+monitorX.ladowarka.maxNapiecie);
        System.out.println("Max natezenie "+monitorX.ladowarka.maxNatezenie);
        System.out.println("Model: "+monitorX.model);
        System.out.println("Rozdzielczosc "+ monitorX.ekran.rozdzielczosc);
        System.out.println("Typ matrycy "+ monitorX.ekran.typMatrycy);


        System.out.println( );

        Monitor monitorX2 = new Monitor();
        monitorX2.Hz=120;
        monitorX2.company="HP";
        monitorX2.ekran.rozdzielczosc= "60";
        monitorX2.ekran.typMatrycy="Swiecaca sie";
        monitorX2.isMatteColor= false;
        monitorX2.ladowarka.maxNapiecie=220;
        monitorX2.ladowarka.maxNatezenie=10;
        monitorX2.model="Samsung";
        monitorX2.watts=50;
        System.out.println("Hz: "+monitorX2.Hz);
        System.out.println("Company: "+monitorX2.company);
        System.out.println("Matte Color: "+monitorX2.isMatteColor);
        System.out.println("Max napiecie "+monitorX2.ladowarka.maxNapiecie);
        System.out.println("Max natezenie "+monitorX2.ladowarka.maxNatezenie);
        System.out.println("Model: "+monitorX2.model);
        System.out.println("Rozdzielczosc "+ monitorX2.ekran.rozdzielczosc);
        System.out.println("Typ matrycy "+ monitorX2.ekran.typMatrycy);

        System.out.println( );

        Monitor monitorX3 = new Monitor();
        monitorX3.Hz=120;
        monitorX3.company="HP";
        monitorX3.ekran.rozdzielczosc= "90";
        monitorX3.ekran.typMatrycy="Swiecaca sie";
        monitorX3.isMatteColor= false;
        monitorX3.ladowarka.maxNapiecie=220;
        monitorX3.ladowarka.maxNatezenie=10;
        monitorX3.model="Samsung";
        monitorX3.watts=50;
        System.out.println("Hz: "+monitorX3.Hz);
        System.out.println("Company: "+monitorX3.company);
        System.out.println("Matte Color: "+monitorX3.isMatteColor);
        System.out.println("Max napiecie "+monitorX3.ladowarka.maxNapiecie);
        System.out.println("Max natezenie "+monitorX3.ladowarka.maxNatezenie);
        System.out.println("Model: "+monitorX3.model);
        System.out.println("Rozdzielczosc "+ monitorX3.ekran.rozdzielczosc);
        System.out.println("Typ matrycy "+ monitorX3.ekran.typMatrycy);

        System.out.println( );

        Chair chair1 = new Chair();
        chair1.rotary=true;
        chair1.mainMaterial="Wood";
        chair1.numberOfScrews=10;
        chair1.numberOfCaps=10;
        chair1.typeOfWood="Sosna";
        chair1.leg.height=40;
        chair1.seat.material="Wood";
        chair1.seat.depth=30;
        chair1.leg.material="Wood";
        System.out.println("Obrotowy "+chair1.rotary);
        System.out.println("Main material "+chair1.mainMaterial);
        System.out.println("Number of screws "+chair1.numberOfScrews);
        System.out.println("Number of caps "+chair1.numberOfCaps);
        System.out.println("Type of wood "+chair1.typeOfWood);
        System.out.println("Leg height "+chair1.leg.height);
        System.out.println("Seat material "+chair1.seat.material);
        System.out.println("Seat depth "+chair1.seat.depth);
        System.out.println("Leg material "+chair1.leg.material);

        System.out.println( );

        Chair chair2 = new Chair();
        chair2.rotary=true;
        chair2.mainMaterial="Wood";
        chair2.numberOfScrews=10;
        chair2.numberOfCaps=10;
        chair2.typeOfWood="Swierk";
        chair2.leg.height=40;
        chair2.seat.material="Wood";
        chair2.seat.depth=30;
        chair2.leg.material="Wood";
        System.out.println("Obrotowy "+chair2.rotary);
        System.out.println("Main material "+chair2.mainMaterial);
        System.out.println("Number of screws "+chair2.numberOfScrews);
        System.out.println("Number of caps "+chair2.numberOfCaps);
        System.out.println("Type of wood "+chair2.typeOfWood);
        System.out.println("Leg height "+chair2.leg.height);
        System.out.println("Seat material "+chair2.seat.material);
        System.out.println("Seat depth "+chair2.seat.depth);
        System.out.println("Leg material "+chair2.leg.material);



        System.out.println( );

        Chair chair3 = new Chair();
        chair3.rotary=true;
        chair3.mainMaterial="Wood";
        chair3.numberOfScrews=10;
        chair3.numberOfCaps=10;
        chair3.typeOfWood="Sosna";
        chair3.leg.height=40;
        chair3.seat.material="Wood";
        chair3.seat.depth=30;
        chair3.leg.material="Wood";
        System.out.println("Obrotowy "+chair3.rotary);
        System.out.println("Main material "+chair3.mainMaterial);
        System.out.println("Number of screws "+chair3.numberOfScrews);
        System.out.println("Number of caps "+chair3.numberOfCaps);
        System.out.println("Type of wood "+chair3.typeOfWood);
        System.out.println("Leg height "+chair3.leg.height);
        System.out.println("Seat material "+chair3.seat.material);
        System.out.println("Seat depth "+chair3.seat.depth);
        System.out.println("Leg material "+chair3.leg.material);
 }
}



