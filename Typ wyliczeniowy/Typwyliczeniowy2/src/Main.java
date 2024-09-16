public class Main {
    public static void main(String[] args) {

        Animal cat = Animal.CAT;
        System.out.println(cat.toString());

        Animal animal = Animal.DOG;
        switch (animal) {
            case CAT:
                System.out.println("To jest kot: " + animal.toString());
                break;
            case DOG:
                System.out.println("To jest pies: " + animal.toString());
                break;
            default:
                System.out.println("Nieznane zwierzę");
        }
    }
}