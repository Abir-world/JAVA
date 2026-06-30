public class Car {
    private String brand;
    private String color;
    private double price;
    private double fuel;

    //encapsulate ->set
    public void setPrice(double price){
        if(price <= 0){
            IO.println("Invalid price");
        }else{
            this.price = price;
        }
    }
    //dekhar jonno getprice because its in private ->private acess er jonno [get,set] lagbe
    public double getPrice(){
        return this.price;
    }
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return this.color;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return this.brand;
    }
    public void setFuel(String brand){
        this.fuel = fuel;
    }
    public double getFuel(){
        return this.fuel;
    }

    Car(String brand, String color, double price ){
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.fuel = 10;

    }
    void refill (double fuelAmount) {
        this.fuel += fuelAmount;
    }

    void horn (){
        IO.println(this.brand + " Beep Beep");
    }

    void horn(String type){ //String type =argument
        IO.println(this.brand = " " + type);
    }
    void accelerate(int time){
        double consumed = time * 5;
        this.fuel -=consumed;
    }

}
