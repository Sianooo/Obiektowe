public class Main {
    public static void main(String[] args) {
        Komputer komputer = new Komputer(5000,"DELL",true);

        System.out.println(komputer.koszt);
        System.out.println(komputer.producent);
        System.out.println(komputer.czynowy);
        komputer.On();
       komputer.Off();




       Konsola konsola = new Konsola(1200,"xbox",true,true);
       Phone phone = new Phone(2500,"samsung",true,true);
       Laptop laptop = new Laptop(7000,"Asus",true,500);
       Monitor monitor = new Monitor(1500,"Gigabyte",true,170);


        System.out.println("Konsola:"+konsola.koszt+" "+konsola.producent+" "+konsola.czynowy+" "+konsola.DVD);
        System.out.println("Monitor"+monitor.koszt+" "+monitor.producent+" "+monitor.czynowy+" "+monitor.hz);
        System.out.println("Telefon"+phone.koszt+" "+phone.producent+" "+phone.czynowy+" "+phone.faceID);
        System.out.println("Laptop"+laptop.koszt+" "+laptop.producent+" "+laptop.czynowy+" "+laptop.howmuchmemory);



       Object [] obiekty = new Object[4];
       obiekty[0] = new Komputer(2000,"MSI",true);
        obiekty[1] = new Konsola (1200,"xbox",true,true);
        obiekty[2] = new Phone(2500,"samsung",true,true);
        obiekty[3] = new Laptop(7000,"Asus",true,500);

        Komputer [] komputery = new Komputer[4];
        komputery[0] = new Komputer(2000,"MSI",true);
        komputery[1] = new Konsola (1200,"xbox",true,true);
        komputery[2] = new Phone(2500,"samsung",true,true);
        komputery[3] = new Laptop(7000,"Asus",true,500);





    }
}