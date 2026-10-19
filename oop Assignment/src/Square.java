public class Square implements Shape{
    double A;
    public Square(double A){
        this.A = A;
    }

    public double getA(){
        return A;
    }
    @Override
    public double area() {
        return A * A;
    }

    @Override
    public double perimeter() {
        return 4 * A;
    }
}
