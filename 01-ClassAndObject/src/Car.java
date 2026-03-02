public class Car {
    String brand;
    int price;

    public void display(){
        System.out.println("brand :- " + brand);
        System.out.println("price :- " + price);
        System.out.println("-------------------");

    }

    public static void main(String [] args){
          Car detail = new Car();
          detail.brand = "Bmw";
          detail.price = 9100000;
          detail.display();


//        2nd car detail
        Car detail1= new Car();
        detail1.brand = "audi";
        detail1.price = 720000;
        detail1.display();
    }
}
