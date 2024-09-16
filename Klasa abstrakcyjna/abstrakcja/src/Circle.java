public class Circle extends Shape {
    double a;

    @Override
     double calculateArea(){
    return Math.PI * a * a;
    }

    public Circle(int a) {
        this.a = a;
    }
}
