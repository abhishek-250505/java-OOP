interface Cars{
    public void start();

}
//child class 1
class ElectricCar implements Cars{
    public void start(){
        System.out.println("Electric car starts Sliently.");
    }
}

//child class 2
class DieselCar implements Cars{
    public void start(){
        System.out.println("Diesel car start with Sound.");
    }
}
public class InterfaceDemo {
    public static void main(String [] args){
        Cars tesla = new ElectricCar();
        Cars xuv = new DieselCar();
        tesla.start();
        xuv.start();
    }
}
