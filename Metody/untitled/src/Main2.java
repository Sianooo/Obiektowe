public class Main2 {

    public static void main(String[] args){
        Car samochod = new Car();
        samochod.turnLeft();
        samochod.reverse();
        samochod.speedUp();
        samochod.brake();
        samochod.turnRight();
        samochod.turnOffCar();

        System.out.println();
        samochod.speed=370;
        samochod.numberOfWheels= 22;
        samochod.brand="Lamborgini";
        samochod.model="Aventador";
        samochod.engineCapacity= 13.0;
        samochod.isElectric=false;
        samochod.kolor="Black";

        samochod.printMaxSpeed();
        samochod.printNumberOfWheels();
        samochod.printBrand();
        samochod.printModel();
        samochod.printEngineCapacity();
        samochod.printIsElectric();
        samochod.printKolor();

        System.out.println("###############Zadanie 4 #################");

        System.out.println("speed :"+samochod.getMaxSpeed());
        System.out.println("numberofwheels :"+samochod.getNumberOfWheels());
        System.out.println("brand :"+samochod.getBrand());
        System.out.println("model :"+samochod.getModel());
        System.out.println("engineCapacity :"+samochod.getEngineCapacity());
        System.out.println("kolor :"+samochod.getKolor());
        System.out.println("iselectric :"+samochod.getIsElectric());


        System.out.println("#############Zadanie 5 ##############");
        System.out.println();
        Tringle tringle = new Tringle();
        tringle.sideA=3;
        tringle.sideB=4;
        tringle.sideC=5;
        System.out.println("Triangle Perimeter  :"+tringle.calculateTrianglePerimeter(tringle.sideA,tringle.sideB,tringle.sideC));


        System.out.println();
        System.out.println("###########Zadaanie 6###############");
        System.out.println();
        TrójmianKwadratowy trojmian = new TrójmianKwadratowy();
        trojmian.x=5;
        trojmian.y=6;
        trojmian.z=-7;
        System.out.println("Wynik Delty :"+trojmian.calculateDelta(trojmian.x,trojmian.y,trojmian.z));
    }
}
