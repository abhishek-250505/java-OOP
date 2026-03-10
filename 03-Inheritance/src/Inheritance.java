class Vehicle{
    int milage ;
    String color;
    double price;

   void display(){
       System.out.println("milage :- " +milage );
       System.out.println("color :- " +color );
       System.out.println("price :- " + price);
   }
}

//inherit property from second structue

class Car extends Vehicle{
    String brand;
    boolean sunroof;

}

public class Inheritance {

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.milage = 22;
        car1.brand = "bmw";
        car1.price = 7500000;
        car1.color = "black";
        car1.display();
    }
}
