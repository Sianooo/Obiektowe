public class Human {
    int wiek;
    String name;

    public Human(int wiek, String name) {
        this.wiek = wiek;
        this.name = name;
    }
    public boolean jestEmerytem() {
        if (wiek >= 67) {
            System.out.println("Jestes emerytem");
            return true;
        }
            else{
                return false;
            }

    }
    }

