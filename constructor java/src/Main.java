/*
void main() {
    Student s1 = new Student();
    s1.id = 19991;
    s1.name = "bonk";
    s1.cgpa = 4;
   //s1.createStudent(1001, "bonk");
    IO.println("name =" + s1.name);

    Student s2 = new Student(1002, "bonk");//constructor

    //define constructor. constructor assign value nibe
    Student s3 = new Student(1002,"abir", 3.52);
    //s3.cgpa = 3.52;-> print 3.52
    IO.println("cgpa " + s3.cgpa);

}  */

void main(){
    Car car1 = new Car("AUDI", "REd", 500000);
    IO.println(car1.getBrand() +":" + car1.getFuel());
    car1.refill(50);
    IO.println(car1.getBrand() + ": "+ car1.getFuel());
    car1.horn();


    Car car2 = new Car("BMV", "BLUE", 4000000);
    IO.println(car2.getBrand() + ": " + car2.getFuel());
    car2.refill(60);
    IO.println(car2.getBrand() + ": "+ car2.getFuel());
    //car2.horn();
    //car2.horn(car2.getBrand() +": peep peep");

    IO.println(car1.getBrand() + " : " + car1.getFuel());
    car1.accelerate(2);
    IO.println(car1.getBrand() + " : " + car1.getFuel());
    car1.accelerate(3);

    IO.println(car2.getBrand() + " : " + car2.getFuel());

    car2.accelerate(4);
    IO.println(car2.getBrand() + " : " + car2.getFuel());

    car2.refill(20);
    IO.println(car2.getBrand() + " : " + car2.getFuel());


    car1.setPrice(-50000);
    IO.println(car1.getBrand() + ": " + car1.getPrice());

}