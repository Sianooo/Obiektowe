public class Main3 {


    public static void main(String[] args){

        Square square = new Square("Square",9);
        Ship ship = new Ship("Maryska",200);
        Student student = new Student("Joe","Kowalski",24);

        System.out.println();
        System.out.println("Square :");
        System.out.println("Name :"+square.name);
        System.out.println("A :"+square.a);


        System.out.println();
        System.out.println("Student :");
        System.out.println("Name :"+ student.name);
        System.out.println("Lastname :"+ student.lastname);
        System.out.println("Age :"+student.age);



        System.out.println();
        System.out.println("Ship :");
        System.out.println("Name :"+ship.name);
        System.out.println("Lenght :"+ship.length);

    }

}
