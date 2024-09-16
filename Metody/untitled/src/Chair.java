public class Chair {

    String mainMaterial;
    int numberOfScrews;
    boolean isComfortable;
    String typeOfWood;
    boolean rotary;
    int numberOfCaps;
    Seat seat;
    Leg leg;


    public Chair(){
        seat= new Seat();
        leg= new Leg();


    }

}
