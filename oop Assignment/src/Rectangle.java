public class Rectangle implements Shape{

    double width;
    double height;
    public Rectangle(double width, double height){
        this.width= width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }
    public double getHeight(){
        return height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2* (width + height);
    }
}
