//2024000000272
void main() {
    Shape circle = new Circle( 6.0);
    Shape rectangle = new Rectangle( 4.0 , 6.0);
    Shape square = new Square(5.5);

    IO.println("Circle:");
    IO.println(String.format("Area: %.3f", circle.area()));
    IO.println(String.format("perimeter: %.3f", circle.perimeter()));

    IO.println("Rectangle:");
    IO.println(String.format("Area: %.3f",circle.area()));
    IO.println(String.format("perimeter: %.3f",circle.perimeter()));

    IO.println("Square:");
    IO.println(String.format("Area: %.3f",circle.area()));
    IO.println(String.format("perimeter: %.3f",circle.perimeter()));
}


