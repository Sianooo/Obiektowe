public class Square extends Shape{

    double a;
    double b;

    @Override
    double calculateArea(){
    return a*b ;
    }

    public Square(double a, double b) {
        this.a = a;
        this.b = b;
    }
}
