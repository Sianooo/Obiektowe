import org.w3c.dom.ls.LSOutput;

public class Car {

    int speed=100;
    int numberOfWheels=4;
    double engineCapacity;
    boolean isElectric=true;
    Car samochod;

    String kolor;
    String brand;
    String model;

    void turnRight() {
        System.out.println("Włączono kirunkowskaz skretu w prawo");
        System.out.println("Sprawdzono czy nic nie jedzie");
        System.out.println("Kierownica samochodu zostala przekrecona w prawo");
    }
    void turnLeft(){
            System.out.println("Włączono kirunkowskaz skretu w prawo");
            System.out.println("Sprawdzono czy nic nie jedzie");
            System.out.println("Kierownica samochodu zostala przekrecona w prawo");

    }
    void speedUp(){
        System.out.println("Złapanie mozno kierownicy, ktora jest ustawiona prosto");
        System.out.println("Wcisniecie mocno podełu gazu");

    }

    void brake(){
        System.out.println("Sprawdzono czy nic nie jedziez tyłu ");
        System.out.println("Wcisniecie lekko pegal hamulca");

    }
    void reverse(){
        System.out.println("Sprawdzono czy mozna cofac");
        System.out.println("Pedał gazu zostal delikatnie wcisniety oraz został wrzucony bieg cofania");
        System.out.println("Kierownica samochodu zostala na wprost prawo,lewo");

    }
    void turnOffCar(){
        System.out.println("Sprawdzono czy mozna wyłaczyc pojazd");
        System.out.println("Wylaczenie pojazdu");

    }
    void printMaxSpeed(){
        speed += 60;
    }
    void printNumberOfWheels(){
        System.out.println("numberOfWheels: "+this.numberOfWheels);
    }
    void printEngineCapacity(){
        System.out.println("engineCapacity: "+this.engineCapacity);
    }
    void printKolor(){
        System.out.println("kolor: "+this.kolor);
    }
    void printIsElectric(){
        System.out.println("isElectric: "+this.isElectric);
    }
    void printBrand(){
        System.out.println("brand: "+this.brand);
    }
    void printModel(){
        System.out.println("model: "+this.model);
    }



    int getMaxSpeed(){
        return speed;
    }
    int getNumberOfWheels(){
        return numberOfWheels;
    }
    double getEngineCapacity(){
        return engineCapacity;
    }
    String getKolor(){
     return kolor;
    }
    boolean getIsElectric(){
     return isElectric;
    }
    String getBrand(){
   return brand;
    }
    String getModel(){
       return model;
    }




}
